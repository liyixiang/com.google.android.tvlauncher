package p000;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: amy */
/* compiled from: PG */
public final class amy extends atg implements bkr {

    /* renamed from: A */
    private int f854A;

    /* renamed from: f */
    public final amb f855f;

    /* renamed from: k */
    private final Context f856k;

    /* renamed from: l */
    private final amh f857l;

    /* renamed from: m */
    private final long[] f858m = new long[10];

    /* renamed from: n */
    private int f859n;

    /* renamed from: o */
    private boolean f860o;

    /* renamed from: p */
    private boolean f861p;

    /* renamed from: q */
    private boolean f862q;

    /* renamed from: r */
    private MediaFormat f863r;

    /* renamed from: s */
    private int f864s;

    /* renamed from: t */
    private int f865t;

    /* renamed from: u */
    private int f866u;

    /* renamed from: v */
    private int f867v;

    /* renamed from: w */
    private long f868w;

    /* renamed from: x */
    private boolean f869x;

    /* renamed from: y */
    private boolean f870y;

    /* renamed from: z */
    private long f871z = -9223372036854775807L;

    public amy(Context context, ati ati, Handler handler, amc amc, amh amh) {
        super(1, ati, 44100.0f);
        this.f856k = context.getApplicationContext();
        this.f857l = amh;
        this.f855f = new amb(handler, amc);
        ((amu) amh).f830h = new amx(this);
    }

    /* renamed from: c */
    public final bkr mo355c() {
        return this;
    }

    /* renamed from: a */
    private final boolean m1146a(int i, String str) {
        return m1147b(i, str) != 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atd.a(akh, akh, boolean):boolean
     arg types: [akh, akh, int]
     candidates:
      atd.a(android.media.MediaCodecInfo$VideoCapabilities, int, int):android.graphics.Point
      atd.a(int, int, double):boolean
      atd.a(akh, akh, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo674a(atd atd, akh akh, akh akh2) {
        if (m1145a(atd, akh2) > this.f859n || akh.f572y != 0 || akh.f573z != 0 || akh2.f572y != 0 || akh2.f573z != 0) {
            return 0;
        }
        if (atd.mo1318a(akh, akh2, true)) {
            return 3;
        }
        if (!blm.m3652a((Object) akh.f556i, (Object) akh2.f556i) || akh.f569v != akh2.f569v || akh.f570w != akh2.f570w || !akh.mo427b(akh2) || "audio/opus".equals(akh.f556i)) {
            return 0;
        }
        return 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atd.a(akh, akh, boolean):boolean
     arg types: [akh, akh, int]
     candidates:
      atd.a(android.media.MediaCodecInfo$VideoCapabilities, int, int):android.graphics.Point
      atd.a(int, int, double):boolean
      atd.a(akh, akh, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo679a(atd atd, MediaCodec mediaCodec, akh akh, float f) {
        boolean z;
        String str;
        akh[] akhArr = this.f423d;
        int a = m1145a(atd, akh);
        if (r2 != 1) {
            int i = a;
            for (akh akh2 : akhArr) {
                if (atd.mo1318a(akh, akh2, false)) {
                    i = Math.max(i, m1145a(atd, akh2));
                }
            }
            a = i;
        }
        this.f859n = a;
        this.f861p = blm.f4293a < 24 && "OMX.SEC.aac.dec".equals(atd.f2328a) && "samsung".equals(blm.f4295c) && (blm.f4294b.startsWith("zeroflte") || blm.f4294b.startsWith("herolte") || blm.f4294b.startsWith("heroqlte"));
        String str2 = atd.f2328a;
        if (blm.f4293a >= 21 || !"OMX.SEC.mp3.dec".equals(str2) || !"samsung".equals(blm.f4295c) || (!blm.f4294b.startsWith("baffin") && !blm.f4294b.startsWith("grand") && !blm.f4294b.startsWith("fortuna") && !blm.f4294b.startsWith("gprimelte") && !blm.f4294b.startsWith("j2y18lte") && !blm.f4294b.startsWith("ms01"))) {
            z = false;
        } else {
            z = true;
        }
        this.f862q = z;
        boolean z2 = atd.f2333f;
        this.f860o = z2;
        if (!z2) {
            str = atd.f2330c;
        } else {
            str = "audio/raw";
        }
        int i2 = this.f859n;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", akh.f569v);
        mediaFormat.setInteger("sample-rate", akh.f570w);
        buj.m4233a(mediaFormat, akh.f558k);
        buj.m4232a(mediaFormat, "max-input-size", i2);
        if (blm.f4293a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (blm.f4293a != 23 || (!"ZTE B2017G".equals(blm.f4296d) && !"AXON 7 mini".equals(blm.f4296d)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (blm.f4293a <= 28 && "audio/ac4".equals(akh.f556i)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        if (this.f860o) {
            this.f863r = mediaFormat;
            mediaFormat.setString("mime", akh.f556i);
            return;
        }
        this.f863r = null;
    }

    /* renamed from: a */
    private final int m1145a(atd atd, akh akh) {
        if (!"OMX.google.raw.decoder".equals(atd.f2328a) || blm.f4293a >= 24 || (blm.f4293a == 23 && blm.m3673c(this.f856k))) {
            return akh.f557j;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo673a(float f, akh[] akhArr) {
        int i = -1;
        for (akh akh : akhArr) {
            int i2 = akh.f570w;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i != -1) {
            return ((float) i) * f;
        }
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List mo682b(ati ati, akh akh) {
        atd a;
        String str = akh.f556i;
        if (str == null) {
            return Collections.emptyList();
        }
        if (m1146a(akh.f569v, str) && (a = ati.mo1331a()) != null) {
            return Collections.singletonList(a);
        }
        List a2 = att.m2129a(ati.mo1332a(str, false, false), akh);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(a2);
            arrayList.addAll(ati.mo1332a("audio/eac3", false, false));
            a2 = arrayList;
        }
        return Collections.unmodifiableList(a2);
    }

    /* renamed from: b */
    private final int m1147b(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.f857l.mo632a(i, 18)) {
                return bkt.m3522h("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int h = bkt.m3522h(str);
        if (this.f857l.mo632a(i, h)) {
            return h;
        }
        return 0;
    }

    /* renamed from: Q */
    public final akq mo376Q() {
        return this.f857l.mo635d();
    }

    /* renamed from: b */
    public final long mo379b() {
        if (this.f421b == 2) {
            m1144D();
        }
        return this.f868w;
    }

    /* renamed from: a */
    public final void mo347a(int i, Object obj) {
        if (i == 2) {
            amh amh = this.f857l;
            float floatValue = ((Float) obj).floatValue();
            amu amu = (amu) amh;
            if (amu.f844v != floatValue) {
                amu.f844v = floatValue;
                amu.mo668h();
            }
        }
    }

    /* renamed from: w */
    public final boolean mo486w() {
        if (!this.f2371i) {
            return false;
        }
        amu amu = (amu) this.f857l;
        if (amu.mo669i()) {
            return amu.f846x && !amu.mo634c();
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo485v() {
        return this.f857l.mo634c() || super.mo485v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo680a(String str, long j, long j2) {
        amb amb = this.f855f;
        if (amb.f742b != null) {
            amb.f741a.post(new alw(amb, str, j, j2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo370r() {
        try {
            this.f871z = -9223372036854775807L;
            this.f854A = 0;
            this.f857l.mo636e();
            try {
                super.mo370r();
            } finally {
                this.f855f.mo630a(this.f2372j);
            }
        } catch (Throwable th) {
            super.mo370r();
            throw th;
        } finally {
            this.f855f.mo630a(this.f2372j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo351a(boolean z) {
        super.mo351a(z);
        amb amb = this.f855f;
        ani ani = this.f2372j;
        if (amb.f742b != null) {
            amb.f741a.post(new alv(amb, ani));
        }
        int i = this.f420a.f638b;
        boolean z2 = false;
        if (i != 0) {
            amh amh = this.f857l;
            if (blm.f4293a >= 21) {
                z2 = true;
            }
            bks.m3512b(z2);
            amu amu = (amu) amh;
            if (!amu.f808A || amu.f848z != i) {
                amu.f808A = true;
                amu.f848z = i;
                amu.mo636e();
                return;
            }
            return;
        }
        amu amu2 = (amu) this.f857l;
        if (amu2.f808A) {
            amu2.f808A = false;
            amu2.f848z = 0;
            amu2.mo636e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo676a(aki aki) {
        int i;
        super.mo676a(aki);
        akh akh = aki.f576c;
        amb amb = this.f855f;
        if (amb.f742b != null) {
            amb.f741a.post(new alx(amb, akh));
        }
        if ("audio/raw".equals(akh.f556i)) {
            i = akh.f571x;
        } else {
            i = 2;
        }
        this.f864s = i;
        this.f865t = akh.f569v;
        this.f866u = akh.f572y;
        this.f867v = akh.f573z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ec A[Catch:{ alt -> 0x00be, amd -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0102 A[Catch:{ alt -> 0x00be, amd -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x014e A[Catch:{ alt -> 0x00be, amd -> 0x0167 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo677a(android.media.MediaCodec r20, android.media.MediaFormat r21) {
        /*
            r19 = this;
            r1 = r19
            android.media.MediaFormat r0 = r1.f863r
            java.lang.String r2 = "channel-count"
            if (r0 != 0) goto L_0x000e
            int r0 = r1.f864s
            r3 = r0
            r0 = r21
            goto L_0x001d
        L_0x000e:
            int r3 = r0.getInteger(r2)
            java.lang.String r4 = "mime"
            java.lang.String r4 = r0.getString(r4)
            int r3 = r1.m1147b(r3, r4)
        L_0x001d:
            int r2 = r0.getInteger(r2)
            java.lang.String r4 = "sample-rate"
            int r8 = r0.getInteger(r4)
            boolean r0 = r1.f861p
            r4 = 0
            r5 = 6
            r16 = 0
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            goto L_0x0047
        L_0x0031:
            if (r2 != r5) goto L_0x0046
            int r0 = r1.f865t
            if (r0 < r5) goto L_0x0038
            goto L_0x0030
        L_0x0038:
            int[] r0 = new int[r0]
            r4 = 0
        L_0x003b:
            int r6 = r1.f865t
            if (r4 < r6) goto L_0x0041
            r4 = r0
            goto L_0x0047
        L_0x0041:
            r0[r4] = r4
            int r4 = r4 + 1
            goto L_0x003b
        L_0x0046:
            goto L_0x0030
        L_0x0047:
            amh r0 = r1.f857l     // Catch:{ amd -> 0x0167 }
            int r6 = r1.f866u     // Catch:{ amd -> 0x0167 }
            int r7 = r1.f867v     // Catch:{ amd -> 0x0167 }
            int r9 = p000.blm.f4293a     // Catch:{ amd -> 0x0167 }
            r10 = 21
            r11 = 8
            if (r9 < r10) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            if (r2 != r11) goto L_0x0063
            int[] r4 = new int[r5]     // Catch:{ amd -> 0x0167 }
            r9 = 0
        L_0x005c:
            if (r9 >= r5) goto L_0x0063
            r4[r9] = r9     // Catch:{ amd -> 0x0167 }
            int r9 = r9 + 1
            goto L_0x005c
        L_0x0063:
            boolean r9 = p000.blm.m3672c(r3)     // Catch:{ amd -> 0x0167 }
            r10 = 4
            r15 = 1
            if (r9 != 0) goto L_0x006e
            r14 = 0
            goto L_0x0074
        L_0x006e:
            if (r3 != r10) goto L_0x0073
            r14 = 0
            goto L_0x0074
        L_0x0073:
            r14 = 1
        L_0x0074:
            r12 = r0
            amu r12 = (p000.amu) r12     // Catch:{ amd -> 0x0167 }
            alu[] r13 = r12.f826d     // Catch:{ amd -> 0x0167 }
            if (r14 != 0) goto L_0x0081
            r5 = r2
            r12 = r3
            r4 = r8
            r17 = 0
            goto L_0x00c9
        L_0x0081:
            r12 = r0
            amu r12 = (p000.amu) r12     // Catch:{ amd -> 0x0167 }
            and r12 = r12.f825c     // Catch:{ amd -> 0x0167 }
            r12.f915e = r6     // Catch:{ amd -> 0x0167 }
            r12.f916f = r7     // Catch:{ amd -> 0x0167 }
            r6 = r0
            amu r6 = (p000.amu) r6     // Catch:{ amd -> 0x0167 }
            amn r6 = r6.f824b     // Catch:{ amd -> 0x0167 }
            r6.f785e = r4     // Catch:{ amd -> 0x0167 }
            int r4 = r13.length     // Catch:{ amd -> 0x0167 }
            r7 = r2
            r5 = r3
            r12 = r8
            r6 = 0
            r17 = 0
        L_0x0098:
            if (r6 >= r4) goto L_0x00c6
            r11 = r13[r6]     // Catch:{ amd -> 0x0167 }
            boolean r18 = r11.mo613a(r12, r7, r5)     // Catch:{ alt -> 0x00be }
            r17 = r17 | r18
            boolean r18 = r11.mo612a()     // Catch:{ amd -> 0x0167 }
            if (r18 == 0) goto L_0x00b7
            int r7 = r11.mo614b()     // Catch:{ amd -> 0x0167 }
            int r5 = r11.mo616d()     // Catch:{ amd -> 0x0167 }
            int r11 = r11.mo615c()     // Catch:{ amd -> 0x0167 }
            r12 = r5
            r5 = r11
            goto L_0x00b8
        L_0x00b7:
        L_0x00b8:
            int r6 = r6 + 1
            r11 = 8
            goto L_0x0098
        L_0x00be:
            r0 = move-exception
            r2 = r0
            amd r0 = new amd     // Catch:{ amd -> 0x0167 }
            r0.<init>(r2)     // Catch:{ amd -> 0x0167 }
            throw r0     // Catch:{ amd -> 0x0167 }
        L_0x00c6:
            r4 = r12
            r12 = r5
            r5 = r7
        L_0x00c9:
            int r6 = p000.blm.f4293a     // Catch:{ amd -> 0x0167 }
            r7 = 28
            if (r6 <= r7) goto L_0x00d0
        L_0x00cf:
            goto L_0x00e5
        L_0x00d0:
            if (r9 != 0) goto L_0x00cf
            r6 = 7
            if (r5 == r6) goto L_0x00e2
            r6 = 3
            if (r5 == r6) goto L_0x00e0
            if (r5 == r10) goto L_0x00e0
            r6 = 5
            if (r5 != r6) goto L_0x00cf
            r6 = 6
            goto L_0x00e6
        L_0x00e0:
            r6 = 6
            goto L_0x00e6
        L_0x00e2:
            r6 = 8
            goto L_0x00e6
        L_0x00e5:
            r6 = r5
        L_0x00e6:
            int r7 = p000.blm.f4293a     // Catch:{ amd -> 0x0167 }
            r10 = 26
            if (r7 > r10) goto L_0x00fc
            java.lang.String r7 = "fugu"
            java.lang.String r10 = p000.blm.f4294b     // Catch:{ amd -> 0x0167 }
            boolean r7 = r7.equals(r10)     // Catch:{ amd -> 0x0167 }
            if (r7 != 0) goto L_0x00f7
            goto L_0x00fc
        L_0x00f7:
            if (r9 != 0) goto L_0x00fc
            if (r6 != r15) goto L_0x00fc
            r6 = 2
        L_0x00fc:
            int r11 = p000.blm.m3677e(r6)     // Catch:{ amd -> 0x0167 }
            if (r11 == 0) goto L_0x014e
            r6 = -1
            if (r9 == 0) goto L_0x010b
            int r2 = p000.blm.m3660b(r3, r2)     // Catch:{ amd -> 0x0167 }
            r7 = r2
            goto L_0x010d
        L_0x010b:
            r7 = -1
        L_0x010d:
            if (r9 == 0) goto L_0x0114
            int r2 = p000.blm.m3660b(r12, r5)     // Catch:{ amd -> 0x0167 }
            goto L_0x0116
        L_0x0114:
            r2 = -1
        L_0x0116:
            amq r3 = new amq     // Catch:{ amd -> 0x0167 }
            r5 = r3
            r6 = r9
            r9 = r2
            r10 = r4
            r2 = r13
            r13 = r14
            r4 = 1
            r15 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ amd -> 0x0167 }
            if (r17 == 0) goto L_0x0126
        L_0x0125:
            goto L_0x012e
        L_0x0126:
            r2 = r0
            amu r2 = (p000.amu) r2     // Catch:{ amd -> 0x0167 }
            amq r2 = r2.f831i     // Catch:{ amd -> 0x0167 }
            if (r2 != 0) goto L_0x0125
            r4 = 0
        L_0x012e:
            r2 = r0
            amu r2 = (p000.amu) r2     // Catch:{ amd -> 0x0167 }
            boolean r2 = r2.mo669i()     // Catch:{ amd -> 0x0167 }
            if (r2 == 0) goto L_0x0149
            r2 = r0
            amu r2 = (p000.amu) r2     // Catch:{ amd -> 0x0167 }
            amq r2 = r2.f832j     // Catch:{ amd -> 0x0167 }
            boolean r2 = r3.mo663a(r2)     // Catch:{ amd -> 0x0167 }
            if (r2 == 0) goto L_0x0144
            if (r4 == 0) goto L_0x0149
        L_0x0144:
            amu r0 = (p000.amu) r0     // Catch:{ amd -> 0x0167 }
            r0.f831i = r3     // Catch:{ amd -> 0x0167 }
            return
        L_0x0149:
            amu r0 = (p000.amu) r0     // Catch:{ amd -> 0x0167 }
            r0.f832j = r3     // Catch:{ amd -> 0x0167 }
            return
        L_0x014e:
            amd r0 = new amd     // Catch:{ amd -> 0x0167 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ amd -> 0x0167 }
            r3 = 38
            r2.<init>(r3)     // Catch:{ amd -> 0x0167 }
            java.lang.String r3 = "Unsupported channel count: "
            r2.append(r3)     // Catch:{ amd -> 0x0167 }
            r2.append(r5)     // Catch:{ amd -> 0x0167 }
            java.lang.String r2 = r2.toString()     // Catch:{ amd -> 0x0167 }
            r0.<init>(r2)     // Catch:{ amd -> 0x0167 }
            throw r0     // Catch:{ amd -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            ajh r0 = p000.ajh.m642a(r0)
            goto L_0x016e
        L_0x016d:
            throw r0
        L_0x016e:
            goto L_0x016d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.amy.mo677a(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo349a(long j, boolean z) {
        super.mo349a(j, z);
        this.f857l.mo636e();
        this.f868w = j;
        this.f869x = true;
        this.f870y = true;
        this.f871z = -9223372036854775807L;
        this.f854A = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo683c(long j) {
        while (this.f854A != 0 && j >= this.f858m[0]) {
            this.f857l.mo633b();
            int i = this.f854A - 1;
            this.f854A = i;
            long[] jArr = this.f858m;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo678a(anj anj) {
        if (this.f869x && !anj.mo1138T()) {
            if (Math.abs(anj.f1426d - this.f868w) > 500000) {
                this.f868w = anj.f1426d;
            }
            this.f869x = false;
        }
        this.f871z = Math.max(anj.f1426d, this.f871z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo371s() {
        try {
            super.mo371s();
        } finally {
            this.f857l.mo637f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo368p() {
        this.f857l.mo631a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo369q() {
        m1144D();
        amu amu = (amu) this.f857l;
        amu.f847y = false;
        if (amu.mo669i()) {
            aml aml = amu.f828f;
            aml.mo648a();
            if (aml.f775v == -9223372036854775807L) {
                ((amj) bks.m3507a(aml.f759f)).mo641b();
                amu.f833k.pause();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo352a(akh[] akhArr, long j) {
        if (this.f871z != -9223372036854775807L) {
            int i = this.f854A;
            long[] jArr = this.f858m;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(67);
                sb.append("Too many stream changes, so dropping change at ");
                sb.append(j2);
                Log.w("MediaCodecAudioRenderer", sb.toString());
            } else {
                this.f854A = i + 1;
            }
            this.f858m[this.f854A - 1] = this.f871z;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void}
     arg types: [int, int]
     candidates:
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, long):void}
      ClspMth{android.media.MediaCodec.releaseOutputBuffer(int, boolean):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x033f, code lost:
        if (r13 != 0) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r10 != -9223372036854775807L) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0222 A[Catch:{ ame | amg -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0229 A[Catch:{ ame | amg -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0256 A[Catch:{ ame | amg -> 0x04ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0257 A[Catch:{ ame | amg -> 0x04ae }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo681a(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42, boolean r43) {
        /*
            r31 = this;
            r1 = r31
            r2 = r36
            r3 = r37
            r4 = r38
            boolean r5 = r1.f862q
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            if (r5 == 0) goto L_0x0022
            int r5 = (r40 > r8 ? 1 : (r40 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0022
            r5 = r39 & 4
            if (r5 == 0) goto L_0x0022
            long r10 = r1.f871z
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r10 = r40
        L_0x0025:
            boolean r5 = r1.f860o
            r12 = 2
            r13 = 0
            r14 = 1
            if (r5 == 0) goto L_0x0036
            r5 = r39 & 2
            if (r5 != 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            r2.releaseOutputBuffer(r4, r13)
            return r14
        L_0x0036:
            if (r42 == 0) goto L_0x0048
            r2.releaseOutputBuffer(r4, r13)
            ani r2 = r1.f2372j
            int r3 = r2.f1420f
            int r3 = r3 + r14
            r2.f1420f = r3
            amh r2 = r1.f857l
            r2.mo633b()
            return r14
        L_0x0048:
            amh r5 = r1.f857l     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r15 = r5
            amu r15 = (p000.amu) r15     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.nio.ByteBuffer r15 = r15.f845w     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r15 != 0) goto L_0x0053
        L_0x0051:
            r15 = 1
            goto L_0x0056
        L_0x0053:
            if (r3 == r15) goto L_0x0051
            r15 = 0
        L_0x0056:
            p000.bks.m3510a(r15)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r15 = r5
            amu r15 = (p000.amu) r15     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r15 = r15.f831i     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 0
            if (r15 == 0) goto L_0x00aa
            r15 = r5
            amu r15 = (p000.amu) r15     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r15 = r15.mo667g()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r15 == 0) goto L_0x0499
            r15 = r5
            amu r15 = (p000.amu) r15     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r15 = r15.f831i     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = r6.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r6 = r15.mo663a(r6)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 == 0) goto L_0x008a
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = r6.f831i     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.f832j = r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f831i = r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x009f
        L_0x008a:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.mo672l()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r6 = r6.mo634c()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 != 0) goto L_0x0499
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.mo636e()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x009f:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            akq r6 = r6.f836n     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.mo665a(r6, r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x00aa:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r6 = r6.mo669i()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 != 0) goto L_0x026f
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.os.ConditionVariable r6 = r6.f827e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.block()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = r6.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.Object r6 = p000.bks.m3507a(r6)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = (p000.amq) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = r5
            amu r12 = (p000.amu) r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r12 = r12.f808A     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = r5
            amu r8 = (p000.amu) r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            alq r8 = r8.f834l     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r9 = r5
            amu r9 = (p000.amu) r9     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r9 = r9.f848z     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r7 = p000.blm.f4293a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r15 = 21
            if (r7 >= r15) goto L_0x011a
            int r7 = r8.f717b     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r9 == 0) goto L_0x00fe
            android.media.AudioTrack r7 = new android.media.AudioTrack     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r18 = 3
            int r8 = r6.f794e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r12 = r6.f795f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r15 = r6.f796g     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r13 = r6.f797h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r23 = 1
            r17 = r7
            r19 = r8
            r20 = r12
            r21 = r15
            r22 = r13
            r24 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x00fc:
            goto L_0x0196
        L_0x00fe:
            android.media.AudioTrack r7 = new android.media.AudioTrack     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r25 = 3
            int r8 = r6.f794e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r9 = r6.f795f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r12 = r6.f796g     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r13 = r6.f797h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r30 = 1
            r24 = r7
            r26 = r8
            r27 = r9
            r28 = r12
            r29 = r13
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x00fc
        L_0x011a:
            if (r12 == 0) goto L_0x0137
            android.media.AudioAttributes$Builder r7 = new android.media.AudioAttributes$Builder     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.<init>()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = 3
            android.media.AudioAttributes$Builder r7 = r7.setContentType(r8)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = 16
            android.media.AudioAttributes$Builder r7 = r7.setFlags(r8)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioAttributes$Builder r7 = r7.setUsage(r14)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioAttributes r7 = r7.build()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r18 = r7
            goto L_0x0164
        L_0x0137:
            android.media.AudioAttributes r7 = r8.f719d     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r7 != 0) goto L_0x0160
            android.media.AudioAttributes$Builder r7 = new android.media.AudioAttributes$Builder     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.<init>()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 0
            android.media.AudioAttributes$Builder r7 = r7.setContentType(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioAttributes$Builder r7 = r7.setFlags(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r12 = r8.f717b     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioAttributes$Builder r7 = r7.setUsage(r14)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r12 = p000.blm.f4293a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r13 = 29
            if (r12 < r13) goto L_0x015a
            int r12 = r8.f718c     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.setAllowedCapturePolicy(r14)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x015a:
            android.media.AudioAttributes r7 = r7.build()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8.f719d = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x0160:
            android.media.AudioAttributes r7 = r8.f719d     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r18 = r7
        L_0x0164:
            android.media.AudioFormat$Builder r7 = new android.media.AudioFormat$Builder     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.<init>()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r8 = r6.f795f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioFormat$Builder r7 = r7.setChannelMask(r8)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r8 = r6.f796g     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioFormat$Builder r7 = r7.setEncoding(r8)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r8 = r6.f794e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioFormat$Builder r7 = r7.setSampleRate(r8)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioFormat r19 = r7.build()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioTrack r7 = new android.media.AudioTrack     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r8 = r6.f797h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r9 == 0) goto L_0x0188
            r22 = r9
            goto L_0x018b
        L_0x0188:
            r22 = 0
        L_0x018b:
            r21 = 1
            r17 = r7
            r20 = r8
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x0196:
            int r8 = r7.getState()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r8 != r14) goto L_0x025e
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f833k = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioTrack r6 = r6.f833k     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r6 = r6.getAudioSessionId()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r7 = r7.f848z     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r7 != r6) goto L_0x01b2
            goto L_0x01d2
        L_0x01b2:
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.f848z = r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amf r7 = r7.f830h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r7 == 0) goto L_0x01d2
            amx r7 = (p000.amx) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amy r7 = r7.f853a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amb r7 = r7.f855f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amc r8 = r7.f742b     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r8 == 0) goto L_0x01d2
            android.os.Handler r8 = r7.f741a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            ama r9 = new ama     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r9.<init>(r7, r6)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8.post(r9)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x01d2:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            akq r6 = r6.f836n     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.mo665a(r6, r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            aml r6 = r6.f828f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioTrack r7 = r7.f833k     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = r5
            amu r8 = (p000.amu) r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r8 = r8.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r9 = r8.f796g     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r12 = r8.f793d     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r8 = r8.f797h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f756c = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f757d = r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f758e = r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amj r13 = new amj     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r13.<init>(r7)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f759f = r13     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r7 = r7.getSampleRate()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f760g = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r7 = p000.blm.f4293a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r13 = 23
            if (r7 < r13) goto L_0x020d
        L_0x020b:
            r7 = 0
            goto L_0x0218
        L_0x020d:
            r7 = 5
            if (r9 == r7) goto L_0x0217
            r7 = 6
            if (r9 != r7) goto L_0x020b
            r7 = 1
            goto L_0x0218
        L_0x0217:
            r7 = 1
        L_0x0218:
            r6.f761h = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r7 = p000.blm.m3672c(r9)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f768o = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r7 == 0) goto L_0x0229
            int r8 = r8 / r12
            long r7 = (long) r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r7 = r6.mo651b(r7)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x022f
        L_0x0229:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x022f:
            r6.f762i = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = 0
            r6.f770q = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f771r = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f772s = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = 0
            r6.f767n = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f775v = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f776w = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = 0
            r6.f766m = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.mo668h()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r6 = r6.f847y     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 != 0) goto L_0x0257
            goto L_0x026f
        L_0x0257:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.mo631a()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x026f
        L_0x025e:
            r7.release()     // Catch:{ Exception -> 0x0262 }
            goto L_0x0263
        L_0x0262:
            r0 = move-exception
        L_0x0263:
            ame r2 = new ame     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r3 = r6.f794e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r4 = r6.f795f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r5 = r6.f797h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r2.<init>(r8, r3, r4, r5)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            throw r2     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x026f:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            aml r6 = r6.f828f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7 = r5
            amu r7 = (p000.amu) r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r7 = r7.mo671k()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioTrack r9 = r6.f756c     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.Object r9 = p000.bks.m3507a(r9)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.media.AudioTrack r9 = (android.media.AudioTrack) r9     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r9 = r9.getPlayState()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r12 = r6.f761h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r12 != 0) goto L_0x028c
            goto L_0x02a3
        L_0x028c:
            r12 = 2
            if (r9 != r12) goto L_0x0295
            r2 = 0
            r6.f767n = r2     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x0499
        L_0x0295:
            if (r9 != r14) goto L_0x02a3
            long r12 = r6.mo652c()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x02a3
            goto L_0x0499
        L_0x02a3:
            boolean r12 = r6.f767n     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r7 = r6.mo649a(r7)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f767n = r7     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r12 == 0) goto L_0x02c0
            if (r7 != 0) goto L_0x02c0
            if (r9 == r14) goto L_0x02c0
            amk r7 = r6.f754a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r7 == 0) goto L_0x02c0
            int r8 = r6.f758e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = r6.f762i     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = p000.aja.m632a(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r7.mo644a(r8, r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x02c0:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.nio.ByteBuffer r6 = r6.f845w     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r7 = "AudioTrack"
            if (r6 != 0) goto L_0x043e
            boolean r6 = r37.hasRemaining()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 != 0) goto L_0x02d1
            goto L_0x04a0
        L_0x02d1:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = r6.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r8 = r6.f790a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r8 != 0) goto L_0x0341
            r8 = r5
            amu r8 = (p000.amu) r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r8 = r8.f841s     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r8 != 0) goto L_0x0341
            int r6 = r6.f796g     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = 7
            if (r6 == r8) goto L_0x0336
            r8 = 8
            if (r6 == r8) goto L_0x0336
            r8 = 5
            if (r6 != r8) goto L_0x02f2
            int r13 = p000.aln.m1026a()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x033a
        L_0x02f2:
            r8 = 6
            if (r6 != r8) goto L_0x02f7
            goto L_0x0331
        L_0x02f7:
            r8 = 18
            if (r6 == r8) goto L_0x0331
            r8 = 17
            if (r6 != r8) goto L_0x0304
            int r13 = p000.alp.m1036a(r37)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x033a
        L_0x0304:
            r8 = 14
            if (r6 != r8) goto L_0x0318
            int r6 = p000.aln.m1033b(r37)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = -1
            if (r6 != r8) goto L_0x0311
            r13 = 0
            goto L_0x033a
        L_0x0311:
            int r6 = p000.aln.m1029a(r3, r6)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r13 = r6 << 4
            goto L_0x033a
        L_0x0318:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r4 = 38
            r3.<init>(r4)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r3.append(r6)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r3 = r3.toString()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r2.<init>(r3)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            throw r2     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x0331:
            int r13 = p000.aln.m1028a(r37)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x033a
        L_0x0336:
            int r13 = p000.amv.m1135a(r37)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x033a:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f841s = r13     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r13 == 0) goto L_0x04a0
        L_0x0341:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            akq r6 = r6.f835m     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 == 0) goto L_0x0362
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r6 = r6.mo667g()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 == 0) goto L_0x0499
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            akq r6 = r6.f835m     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = r5
            amu r8 = (p000.amu) r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r9 = 0
            r8.f835m = r9     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = r5
            amu r8 = (p000.amu) r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8.mo665a(r6, r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x0362:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r6 = r6.f842t     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 != 0) goto L_0x037b
            r8 = 0
            long r12 = java.lang.Math.max(r8, r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f843u = r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f842t = r14     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x040d
        L_0x037b:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r6.f843u     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = r6.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = r5
            amu r12 = (p000.amu) r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = r12.mo670j()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r15 = r5
            amu r15 = (p000.amu) r15     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            and r15 = r15.f825c     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r14 = r15.f917g     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = r12 - r14
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 * r14
            int r6 = r6.f792c     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r14 = (long) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = r12 / r14
            long r8 = r8 + r12
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r6 = r6.f842t     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 1
            if (r6 != r12) goto L_0x03dc
            long r12 = r8 - r10
            long r12 = java.lang.Math.abs(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r14 = 200000(0x30d40, double:9.8813E-319)
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x03dc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 80
            r6.<init>(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r12 = "Discontinuity detected [expected "
            r6.append(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.append(r8)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r12 = ", got "
            r6.append(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.append(r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r12 = "]"
            r6.append(r12)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.lang.String r6 = r6.toString()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            android.util.Log.e(r7, r6)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 2
            r6.f842t = r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x03dc:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r6 = r6.f842t     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 2
            if (r6 != r12) goto L_0x040d
            long r8 = r10 - r8
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = r6.f843u     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = r12 + r8
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f843u = r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = 1
            r6.f842t = r12     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amf r6 = r6.f830h     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 == 0) goto L_0x040d
            r12 = 0
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x040d
            amx r6 = (p000.amx) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amy r6 = r6.f853a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r8 = 1
            r6.f870y = r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x040d:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r6 = r6.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r6 = r6.f790a     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r6 == 0) goto L_0x0427
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r6.f839q     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r6 = r37.remaining()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = (long) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r8 + r12
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f839q = r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x0439
        L_0x0427:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r6.f840r     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r6 = r6.f841s     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r12 = (long) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r8 + r12
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f840r = r8     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x0439:
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.f845w = r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x043e:
            r3 = r5
            amu r3 = (p000.amu) r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amq r3 = r3.f832j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r3 = r3.f798i     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r3 != 0) goto L_0x0453
            r3 = r5
            amu r3 = (p000.amu) r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.nio.ByteBuffer r3 = r3.f845w     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6.mo666a(r3, r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x0459
        L_0x0453:
            r3 = r5
            amu r3 = (p000.amu) r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r3.mo664a(r10)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x0459:
            r3 = r5
            amu r3 = (p000.amu) r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            java.nio.ByteBuffer r3 = r3.f845w     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            boolean r3 = r3.hasRemaining()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            if (r3 == 0) goto L_0x049b
            r3 = r5
            amu r3 = (p000.amu) r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            aml r3 = r3.f828f     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r6 = r5
            amu r6 = (p000.amu) r6     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r6.mo671k()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r10 = r3.f776w     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x0499
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x0499
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r10 = r3.f776w     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            long r8 = r8 - r10
            r10 = 200(0xc8, double:9.9E-322)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x0499
            java.lang.String r3 = "Resetting stalled audio track"
            android.util.Log.w(r7, r3)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            amu r5 = (p000.amu) r5     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r5.mo636e()     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            goto L_0x04a0
        L_0x0499:
            r2 = 0
            return r2
        L_0x049b:
            amu r5 = (p000.amu) r5     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r3 = 0
            r5.f845w = r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
        L_0x04a0:
            r3 = 0
            r2.releaseOutputBuffer(r4, r3)     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            ani r2 = r1.f2372j     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            int r3 = r2.f1419e     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            r4 = 1
            int r3 = r3 + r4
            r2.f1419e = r3     // Catch:{ ame -> 0x04b0, amg -> 0x04ae }
            return r4
        L_0x04ae:
            r0 = move-exception
            goto L_0x04b1
        L_0x04b0:
            r0 = move-exception
        L_0x04b1:
            r2 = r0
            ajh r2 = p000.ajh.m642a(r2)
            goto L_0x04b8
        L_0x04b7:
            throw r2
        L_0x04b8:
            goto L_0x04b7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.amy.mo681a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo684x() {
        try {
            amh amh = this.f857l;
            if (!((amu) amh).f846x && ((amu) amh).mo669i() && ((amu) amh).mo667g()) {
                ((amu) amh).mo672l();
                ((amu) amh).f846x = true;
            }
        } catch (amg e) {
            throw ajh.m642a(e);
        }
    }

    /* renamed from: a */
    public final void mo378a(akq akq) {
        amu amu = (amu) this.f857l;
        amq amq = amu.f832j;
        if (amq != null && !amq.f799j) {
            amu.f836n = akq.f624a;
        } else if (akq.equals(amu.mo635d())) {
        } else {
            if (amu.mo669i()) {
                amu.f835m = akq;
            } else {
                amu.f836n = akq;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo675a(p000.ati r8, p000.akh r9) {
        /*
            r7 = this;
            java.lang.String r0 = r9.f556i
            boolean r1 = p000.bkt.m3515a(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0095
            int r1 = p000.blm.f4293a
            r3 = 21
            if (r1 < r3) goto L_0x0012
            r1 = 32
            goto L_0x0014
        L_0x0012:
            r1 = 0
        L_0x0014:
            anq r3 = r9.f559l
            r4 = 1
            if (r3 == 0) goto L_0x0031
            java.lang.Class r3 = r9.f546C
            java.lang.Class<anw> r3 = p000.anw.class
            r5 = 0
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0031
            java.lang.Class r3 = r9.f546C
            anq r3 = r9.f559l
            boolean r3 = m599a(r3)
            if (r3 != 0) goto L_0x0030
            r3 = 0
            goto L_0x0032
        L_0x0030:
        L_0x0031:
            r3 = 1
        L_0x0032:
            if (r3 == 0) goto L_0x0046
            int r5 = r9.f569v
            boolean r5 = r7.m1146a(r5, r0)
            if (r5 != 0) goto L_0x003d
            goto L_0x0046
        L_0x003d:
            atd r5 = r8.mo1331a()
            if (r5 == 0) goto L_0x0046
            r8 = r1 | 12
            return r8
        L_0x0046:
            java.lang.String r5 = "audio/raw"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005b
            amh r0 = r7.f857l
            int r5 = r9.f569v
            int r6 = r9.f571x
            boolean r0 = r0.mo632a(r5, r6)
            if (r0 == 0) goto L_0x0094
        L_0x005b:
            amh r0 = r7.f857l
            int r5 = r9.f569v
            r6 = 2
            boolean r0 = r0.mo632a(r5, r6)
            if (r0 == 0) goto L_0x0094
            java.util.List r8 = r7.mo682b(r8, r9)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0094
            if (r3 == 0) goto L_0x0093
            java.lang.Object r8 = r8.get(r2)
            atd r8 = (p000.atd) r8
            boolean r0 = r8.mo1317a(r9)
            r2 = 8
            if (r0 == 0) goto L_0x0089
            boolean r8 = r8.mo1320b(r9)
            if (r8 == 0) goto L_0x0089
            r2 = 16
            goto L_0x008a
        L_0x0089:
        L_0x008a:
            if (r0 != 0) goto L_0x008e
            r8 = 3
            goto L_0x008f
        L_0x008e:
            r8 = 4
        L_0x008f:
            r9 = r2 | r1
            r8 = r8 | r9
            return r8
        L_0x0093:
            return r6
        L_0x0094:
            return r4
        L_0x0095:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.amy.mo675a(ati, akh):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ams} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0143  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m1144D() {
        /*
            r27 = this;
            r1 = r27
            amh r0 = r1.f857l
            boolean r2 = r27.mo486w()
            r3 = r0
            amu r3 = (p000.amu) r3
            boolean r0 = r3.mo669i()
            if (r0 == 0) goto L_0x0290
            int r0 = r3.f842t
            if (r0 == 0) goto L_0x028f
            aml r7 = r3.f828f
            android.media.AudioTrack r0 = r7.f756c
            java.lang.Object r0 = p000.bks.m3507a(r0)
            android.media.AudioTrack r0 = (android.media.AudioTrack) r0
            int r0 = r0.getPlayState()
            r9 = 1000(0x3e8, double:4.94E-321)
            r11 = 3
            r12 = 2
            r13 = 1
            if (r0 != r11) goto L_0x01cb
            long r21 = r7.mo650b()
            r14 = 0
            int r0 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01c9
            long r16 = java.lang.System.nanoTime()
            long r5 = r16 / r9
            long r8 = r7.f764k
            long r8 = r5 - r8
            r16 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0074
            long[] r0 = r7.f755b
            int r8 = r7.f773t
            long r9 = r21 - r5
            r0[r8] = r9
            int r8 = r8 + r13
            r0 = 10
            int r8 = r8 % r0
            r7.f773t = r8
            int r8 = r7.f774u
            if (r8 >= r0) goto L_0x0059
            int r8 = r8 + r13
            r7.f774u = r8
        L_0x0059:
            r7.f764k = r5
            r7.f763j = r14
            r0 = 0
        L_0x005e:
            int r8 = r7.f774u
            if (r0 >= r8) goto L_0x0074
            long r9 = r7.f763j
            long[] r14 = r7.f755b
            r18 = r14[r0]
            long r14 = (long) r8
            long r18 = r18 / r14
            long r9 = r9 + r18
            r7.f763j = r9
            int r0 = r0 + 1
            r14 = 0
            goto L_0x005e
        L_0x0074:
            boolean r0 = r7.f761h
            if (r0 != 0) goto L_0x01c7
            amj r0 = r7.f759f
            java.lang.Object r0 = p000.bks.m3507a(r0)
            amj r0 = (p000.amj) r0
            ami r8 = r0.f748a
            r23 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r8 == 0) goto L_0x016d
            long r14 = r0.f752e
            long r14 = r5 - r14
            long r9 = r0.f751d
            int r18 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r18 < 0) goto L_0x016d
            r0.f752e = r5
            android.media.AudioTrack r9 = r8.f743a
            android.media.AudioTimestamp r10 = r8.f744b
            boolean r9 = r9.getTimestamp(r10)
            if (r9 == 0) goto L_0x00bc
            android.media.AudioTimestamp r10 = r8.f744b
            long r14 = r10.framePosition
            r25 = r5
            long r4 = r8.f746d
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b1
            long r4 = r8.f745c
            r18 = 1
            long r4 = r4 + r18
            r8.f745c = r4
        L_0x00b1:
            r8.f746d = r14
            long r4 = r8.f745c
            r6 = 32
            long r4 = r4 << r6
            long r14 = r14 + r4
            r8.f747e = r14
            goto L_0x00be
        L_0x00bc:
            r25 = r5
        L_0x00be:
            int r4 = r0.f749b
            if (r4 == 0) goto L_0x00f9
            if (r4 == r13) goto L_0x00e2
            if (r4 == r12) goto L_0x00d9
            if (r4 == r11) goto L_0x00cf
            if (r9 == 0) goto L_0x00cb
            goto L_0x0121
        L_0x00cb:
            r10 = 0
            goto L_0x0171
        L_0x00cf:
            if (r9 == 0) goto L_0x00d5
            r0.mo641b()
            goto L_0x0121
        L_0x00d5:
            r10 = 0
            goto L_0x0171
        L_0x00d9:
            if (r9 != 0) goto L_0x0121
            r0.mo641b()
            r10 = 0
            goto L_0x0171
        L_0x00e2:
            if (r9 == 0) goto L_0x00f2
            ami r4 = r0.f748a
            long r4 = r4.f747e
            long r8 = r0.f753f
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0121
            r0.mo640a(r12)
            goto L_0x0121
        L_0x00f2:
            r0.mo641b()
            r10 = 0
            goto L_0x0171
        L_0x00f9:
            if (r9 != 0) goto L_0x010c
            long r4 = r0.f750c
            long r4 = r25 - r4
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d5
            r0.mo640a(r11)
            r10 = 0
            goto L_0x0171
        L_0x010c:
            ami r4 = r0.f748a
            long r4 = r4.mo638a()
            long r8 = r0.f750c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x016a
            ami r4 = r0.f748a
            long r4 = r4.f747e
            r0.f753f = r4
            r0.mo640a(r13)
        L_0x0121:
            long r4 = r0.mo642c()
            long r8 = r0.mo643d()
            long r14 = r4 - r25
            long r14 = java.lang.Math.abs(r14)
            int r6 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r6 <= 0) goto L_0x0143
            amk r14 = r7.f754a
            r10 = 0
            r15 = r8
            r17 = r4
            r19 = r25
            r14.mo647b(r15, r17, r19, r21)
            r0.mo639a()
            goto L_0x0171
        L_0x0143:
            r10 = 0
            long r14 = r7.mo651b(r8)
            long r14 = r14 - r21
            long r14 = java.lang.Math.abs(r14)
            int r16 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r16 <= 0) goto L_0x0161
            amk r14 = r7.f754a
            r15 = r8
            r17 = r4
            r19 = r25
            r14.mo646a(r15, r17, r19, r21)
            r0.mo639a()
            goto L_0x0171
        L_0x0161:
            int r4 = r0.f749b
            r5 = 4
            if (r4 != r5) goto L_0x0171
            r0.mo641b()
            goto L_0x0171
        L_0x016a:
            r10 = 0
            goto L_0x0171
        L_0x016d:
            r25 = r5
            r10 = 0
        L_0x0171:
            boolean r0 = r7.f768o
            if (r0 == 0) goto L_0x01c5
            java.lang.reflect.Method r0 = r7.f765l
            if (r0 == 0) goto L_0x01c5
            long r4 = r7.f769p
            long r4 = r25 - r4
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x01c5
            android.media.AudioTrack r4 = r7.f756c     // Catch:{ Exception -> 0x01bc }
            java.lang.Object r4 = p000.bks.m3507a(r4)     // Catch:{ Exception -> 0x01bc }
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01bc }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ Exception -> 0x01bc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01bc }
            java.lang.Object r0 = p000.blm.m3636a(r0)     // Catch:{ Exception -> 0x01bc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01bc }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01bc }
            long r8 = (long) r0     // Catch:{ Exception -> 0x01bc }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r14
            long r14 = r7.f762i     // Catch:{ Exception -> 0x01bc }
            long r8 = r8 - r14
            r7.f766m = r8     // Catch:{ Exception -> 0x01bc }
            long r8 = java.lang.Math.max(r8, r10)     // Catch:{ Exception -> 0x01bc }
            r7.f766m = r8     // Catch:{ Exception -> 0x01bc }
            int r0 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ba
            amk r0 = r7.f754a     // Catch:{ Exception -> 0x01bc }
            r0.mo645a(r8)     // Catch:{ Exception -> 0x01bc }
            r7.f766m = r10     // Catch:{ Exception -> 0x01bc }
            r4 = 0
            goto L_0x01c0
        L_0x01ba:
            r4 = 0
            goto L_0x01c0
        L_0x01bc:
            r0 = move-exception
            r4 = 0
            r7.f765l = r4
        L_0x01c0:
            r8 = r25
            r7.f769p = r8
            goto L_0x01cc
        L_0x01c5:
            r4 = 0
            goto L_0x01cc
        L_0x01c7:
            r4 = 0
            goto L_0x01cc
        L_0x01c9:
            r4 = 0
            goto L_0x01cc
        L_0x01cb:
            r4 = 0
        L_0x01cc:
            long r8 = java.lang.System.nanoTime()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            amj r0 = r7.f759f
            java.lang.Object r0 = p000.bks.m3507a(r0)
            amj r0 = (p000.amj) r0
            int r6 = r0.f749b
            if (r6 == r13) goto L_0x01f5
            if (r6 == r12) goto L_0x01f5
            int r0 = r7.f774u
            if (r0 == 0) goto L_0x01e9
            long r10 = r7.f763j
            long r8 = r8 + r10
            goto L_0x01ef
        L_0x01e9:
            long r8 = r7.mo650b()
        L_0x01ef:
            if (r2 != 0) goto L_0x01f4
            long r6 = r7.f766m
            long r8 = r8 - r6
        L_0x01f4:
            goto L_0x0209
        L_0x01f5:
            long r10 = r0.mo643d()
            long r6 = r7.mo651b(r10)
            int r2 = r0.f749b
            if (r2 != r12) goto L_0x0208
            long r10 = r0.mo642c()
            long r8 = r8 - r10
            long r8 = r8 + r6
            goto L_0x0209
        L_0x0208:
            r8 = r6
        L_0x0209:
            amq r0 = r3.f832j
            long r6 = r3.mo671k()
            long r6 = r0.mo662a(r6)
            long r6 = java.lang.Math.min(r8, r6)
            long r8 = r3.f843u
        L_0x021a:
            java.util.ArrayDeque r0 = r3.f829g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x023a
            java.util.ArrayDeque r0 = r3.f829g
            java.lang.Object r0 = r0.getFirst()
            ams r0 = (p000.ams) r0
            long r10 = r0.f806c
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x023a
            java.util.ArrayDeque r0 = r3.f829g
            java.lang.Object r0 = r0.remove()
            r4 = r0
            ams r4 = (p000.ams) r4
            goto L_0x021a
        L_0x023a:
            if (r4 == 0) goto L_0x024b
            akq r0 = r4.f804a
            r3.f836n = r0
            long r10 = r4.f806c
            r3.f838p = r10
            long r10 = r4.f805b
            long r12 = r3.f843u
            long r10 = r10 - r12
            r3.f837o = r10
        L_0x024b:
            akq r0 = r3.f836n
            float r0 = r0.f625b
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x025c
            long r10 = r3.f837o
            long r6 = r6 + r10
            long r10 = r3.f838p
            long r6 = r6 - r10
            goto L_0x027f
        L_0x025c:
            java.util.ArrayDeque r0 = r3.f829g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0271
            long r10 = r3.f837o
            amp r0 = r3.f823a
            long r12 = r3.f838p
            long r6 = r6 - r12
            long r6 = r0.mo660a(r6)
            long r6 = r6 + r10
            goto L_0x027f
        L_0x0271:
            long r10 = r3.f837o
            long r12 = r3.f838p
            long r6 = r6 - r12
            akq r0 = r3.f836n
            float r0 = r0.f625b
            long r6 = p000.blm.m3630a(r6, r0)
            long r6 = r6 + r10
        L_0x027f:
            amq r0 = r3.f832j
            amp r2 = r3.f823a
            long r2 = r2.mo659a()
            long r2 = r0.mo662a(r2)
            long r6 = r6 + r2
            long r2 = r8 + r6
            goto L_0x0292
        L_0x028f:
        L_0x0290:
            r2 = -9223372036854775808
        L_0x0292:
            r6 = -9223372036854775808
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x02a9
            boolean r0 = r1.f870y
            if (r0 != 0) goto L_0x02a3
            long r6 = r1.f868w
            long r2 = java.lang.Math.max(r6, r2)
            goto L_0x02a4
        L_0x02a3:
        L_0x02a4:
            r1.f868w = r2
            r2 = 0
            r1.f870y = r2
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.amy.m1144D():void");
    }
}
