package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* renamed from: clg */
/* compiled from: PG */
public final class clg implements Runnable {

    /* renamed from: a */
    private final Context f5903a;

    /* renamed from: b */
    private final long f5904b;

    /* renamed from: c */
    private final String f5905c;

    /* renamed from: d */
    private final clr f5906d;

    public clg(Context context, long j, String str, clr clr) {
        this.f5903a = context;
        this.f5904b = j;
        this.f5905c = str;
        this.f5906d = clr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clg) {
            clg clg = (clg) obj;
            if (!TextUtils.equals(this.f5905c, clg.f5905c) || this.f5904b != clg.f5904b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5905c, Long.valueOf(this.f5904b));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02df, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02df A[ExcHandler: cnd (e cnd), Splitter:B:131:0x01af] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0334  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 0
            android.content.Context r4 = r11.f5903a     // Catch:{ IOException -> 0x0138, bod -> 0x0136, boe -> 0x0134 }
            bmo r5 = new bmo     // Catch:{ IOException -> 0x0138, bod -> 0x0136, boe -> 0x0134 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0138, bod -> 0x0136, boe -> 0x0134 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0126 }
            java.lang.String r4 = "Calling this from your main thread can lead to deadlock"
            p000.buh.m4211b(r4)     // Catch:{ all -> 0x0126 }
            monitor-enter(r5)     // Catch:{ all -> 0x0126 }
            boolean r4 = r5.f4420c     // Catch:{ all -> 0x0123 }
            if (r4 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r5.mo2152a()     // Catch:{ all -> 0x0123 }
        L_0x0022:
            android.content.Context r4 = r5.f4422e     // Catch:{ all -> 0x0123 }
            android.content.pm.PackageManager r8 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x011c }
            java.lang.String r9 = "com.android.vending"
            r8.getPackageInfo(r9, r2)     // Catch:{ NameNotFoundException -> 0x011c }
            bnv r8 = p000.bnv.f4496c     // Catch:{ all -> 0x0123 }
            r9 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r8 = r8.mo2214a(r4, r9)     // Catch:{ all -> 0x0123 }
            if (r8 == 0) goto L_0x0043
            if (r8 != r0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "Google Play services not available"
            r4.<init>(r6)     // Catch:{ all -> 0x0123 }
            throw r4     // Catch:{ all -> 0x0123 }
        L_0x0043:
            java.lang.String r8 = "com.google.android.gms.ads.identifier.service.START"
            bnn r9 = new bnn     // Catch:{ all -> 0x0123 }
            r9.<init>()     // Catch:{ all -> 0x0123 }
            android.content.Intent r10 = new android.content.Intent     // Catch:{ all -> 0x0123 }
            r10.<init>(r8)     // Catch:{ all -> 0x0123 }
            java.lang.String r8 = "com.google.android.gms"
            r10.setPackage(r8)     // Catch:{ all -> 0x0123 }
            p000.bui.m4228a()     // Catch:{ all -> 0x0115 }
            java.lang.Class r8 = r4.getClass()     // Catch:{ all -> 0x0115 }
            r8.getName()     // Catch:{ all -> 0x0115 }
            boolean r4 = p000.bui.m4229a(r4, r10, r9, r1)     // Catch:{ all -> 0x0115 }
            if (r4 == 0) goto L_0x010d
            r5.f4418a = r9     // Catch:{ all -> 0x0123 }
            bnn r4 = r5.f4418a     // Catch:{ all -> 0x0123 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            java.lang.String r9 = "BlockingServiceConnection.getServiceWithTimeout() called on main thread"
            p000.buh.m4211b(r9)     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            boolean r9 = r4.f4479a     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            if (r9 != 0) goto L_0x00f5
            r4.f4479a = r1     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            java.util.concurrent.BlockingQueue r4 = r4.f4480b     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = r4.poll(r9, r8)     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            if (r4 == 0) goto L_0x00ed
            java.lang.String r8 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
            android.os.IInterface r8 = r4.queryLocalInterface(r8)     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            boolean r9 = r8 instanceof p000.bmr     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            if (r9 != 0) goto L_0x0091
            bmq r8 = new bmq     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            r8.<init>(r4)     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            goto L_0x0093
        L_0x0091:
            bmr r8 = (p000.bmr) r8     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
        L_0x0093:
            r5.f4419b = r8     // Catch:{ all -> 0x0123 }
            r5.f4420c = r1     // Catch:{ all -> 0x0123 }
            monitor-exit(r5)     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "Calling this from your main thread can lead to deadlock"
            p000.buh.m4211b(r4)     // Catch:{ all -> 0x0126 }
            monitor-enter(r5)     // Catch:{ all -> 0x0126 }
            boolean r4 = r5.f4420c     // Catch:{ all -> 0x00ea }
            if (r4 == 0) goto L_0x00dc
            bnn r4 = r5.f4418a     // Catch:{ all -> 0x00ea }
            p000.buh.m4199a(r4)     // Catch:{ all -> 0x00ea }
            bmr r4 = r5.f4419b     // Catch:{ all -> 0x00ea }
            p000.buh.m4199a(r4)     // Catch:{ all -> 0x00ea }
            bmn r4 = new bmn     // Catch:{ RemoteException -> 0x00d3 }
            bmr r8 = r5.f4419b     // Catch:{ RemoteException -> 0x00d3 }
            java.lang.String r8 = r8.mo2156b()     // Catch:{ RemoteException -> 0x00d3 }
            bmr r9 = r5.f4419b     // Catch:{ RemoteException -> 0x00d3 }
            boolean r9 = r9.mo2157c()     // Catch:{ RemoteException -> 0x00d3 }
            r4.<init>(r8, r9)     // Catch:{ RemoteException -> 0x00d3 }
            monitor-exit(r5)     // Catch:{ all -> 0x00ea }
            java.lang.Object r8 = r5.f4421d     // Catch:{ all -> 0x0126 }
            monitor-enter(r8)     // Catch:{ all -> 0x0126 }
            monitor-exit(r8)     // Catch:{ all -> 0x00d0 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0126 }
            long r8 = r8 - r6
            java.lang.String r6 = ""
            p000.bmo.m3759a(r4, r8, r6, r3)     // Catch:{ all -> 0x0126 }
            r5.mo2152a()     // Catch:{ IOException -> 0x0138, bod -> 0x0136, boe -> 0x0134 }
            goto L_0x0142
        L_0x00d0:
            r4 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00d0 }
            throw r4     // Catch:{ all -> 0x0126 }
        L_0x00d3:
            r4 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ea }
            java.lang.String r6 = "Remote exception"
            r4.<init>(r6)     // Catch:{ all -> 0x00ea }
            throw r4     // Catch:{ all -> 0x00ea }
        L_0x00dc:
            java.lang.Object r4 = r5.f4421d     // Catch:{ all -> 0x00ea }
            monitor-enter(r4)     // Catch:{ all -> 0x00ea }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00e7 }
            java.lang.String r7 = "AdvertisingIdClient is not connected."
            r6.<init>(r7)     // Catch:{ all -> 0x00e7 }
            throw r6     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            throw r6     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ea }
            throw r4     // Catch:{ all -> 0x0126 }
        L_0x00ed:
            java.util.concurrent.TimeoutException r4 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            java.lang.String r6 = "Timed out waiting for the service connection"
            r4.<init>(r6)     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            throw r4     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
        L_0x00f5:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            java.lang.String r6 = "Cannot call get on this connection more than once"
            r4.<init>(r6)     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
            throw r4     // Catch:{ InterruptedException -> 0x0104, all -> 0x00fd }
        L_0x00fd:
            r4 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x0123 }
            r6.<init>(r4)     // Catch:{ all -> 0x0123 }
            throw r6     // Catch:{ all -> 0x0123 }
        L_0x0104:
            r4 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "Interrupted exception"
            r4.<init>(r6)     // Catch:{ all -> 0x0123 }
            throw r4     // Catch:{ all -> 0x0123 }
        L_0x010d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0123 }
            java.lang.String r6 = "Connection failure"
            r4.<init>(r6)     // Catch:{ all -> 0x0123 }
            throw r4     // Catch:{ all -> 0x0123 }
        L_0x0115:
            r4 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x0123 }
            r6.<init>(r4)     // Catch:{ all -> 0x0123 }
            throw r6     // Catch:{ all -> 0x0123 }
        L_0x011c:
            r4 = move-exception
            bod r4 = new bod     // Catch:{ all -> 0x0123 }
            r4.<init>()     // Catch:{ all -> 0x0123 }
            throw r4     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0123 }
            throw r4     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r4 = move-exception
            r6 = -1
            java.lang.String r8 = ""
            p000.bmo.m3759a(r3, r6, r8, r4)     // Catch:{ all -> 0x012f }
            throw r4     // Catch:{ all -> 0x012f }
        L_0x012f:
            r4 = move-exception
            r5.mo2152a()     // Catch:{ IOException -> 0x0138, bod -> 0x0136, boe -> 0x0134 }
            throw r4     // Catch:{ IOException -> 0x0138, bod -> 0x0136, boe -> 0x0134 }
        L_0x0134:
            r4 = move-exception
            goto L_0x0139
        L_0x0136:
            r4 = move-exception
            goto L_0x0139
        L_0x0138:
            r4 = move-exception
        L_0x0139:
            java.lang.String r5 = "AdsManager"
            java.lang.String r6 = "AdLoaderTask: could not get advertisingIdInfo"
            android.util.Log.e(r5, r6, r4)
            r4 = r3
        L_0x0142:
            clr r5 = r11.f5906d
            java.lang.String r6 = r11.f5905c
            cof r7 = new cof
            cog r8 = new cog
            r8.<init>()
            r8.f6144a = r6
            java.lang.String r6 = "www.google.com"
            r8.f6145b = r6
            java.lang.String r6 = "www.google.com"
            r8.f6146c = r6
            java.util.Set r6 = p000.clo.f5920a
            r8.f6147d = r6
            java.util.Set r6 = p000.clo.f5921b
            r8.f6148e = r6
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = java.lang.String.valueOf(r9)
            r8.f6149f = r6
            java.util.Map r6 = p000.clo.f5922c
            r8.f6150g = r6
            r8.f6151h = r4
            coh r4 = new coh
            r4.<init>(r8)
            r7.<init>(r4)
            android.net.Uri r4 = r7.f6143a
            java.lang.String r4 = r4.toString()
            r6 = 0
        L_0x017e:
            if (r6 >= r0) goto L_0x01a4
            clx r7 = r5.f5924a     // Catch:{ IOException -> 0x018d, clt -> 0x018b }
            java.net.HttpURLConnection r7 = r7.mo3102a(r4)     // Catch:{ IOException -> 0x018d, clt -> 0x018b }
            java.io.InputStream r4 = r7.getInputStream()     // Catch:{ IOException -> 0x018d, clt -> 0x018b }
            goto L_0x01a6
        L_0x018b:
            r7 = move-exception
            goto L_0x018e
        L_0x018d:
            r7 = move-exception
        L_0x018e:
            if (r6 <= 0) goto L_0x0191
            goto L_0x0196
        L_0x0191:
            clm r7 = r5.f5925b     // Catch:{ InterruptedException -> 0x0199 }
            r7.mo3100a()     // Catch:{ InterruptedException -> 0x0199 }
        L_0x0196:
            int r6 = r6 + 1
            goto L_0x017e
        L_0x0199:
            r4 = move-exception
            java.lang.String r5 = "DoubleClickAdServer"
            java.lang.String r6 = "getDoubleClickAdFromServer interrupted: abort remaining connection retries."
            android.util.Log.e(r5, r6, r4)
            r4 = r3
            goto L_0x01a6
        L_0x01a4:
            r4 = r3
        L_0x01a6:
            if (r4 == 0) goto L_0x0352
            java.lang.String r5 = r11.f5905c
            com.google.android.tvlauncher.doubleclick.vast.VastParser r6 = new com.google.android.tvlauncher.doubleclick.vast.VastParser
            r6.<init>()
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7.<init>()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r8 = 65536(0x10000, float:9.18355E-41)
            byte[] r8 = new byte[r8]     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
        L_0x01b8:
            int r9 = r4.read(r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r10 = -1
            if (r9 == r10) goto L_0x01c3
            r7.write(r8, r2, r9)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            goto L_0x01b8
        L_0x01c3:
            byte[] r4 = r7.toByteArray()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cnf r7 = new cnf     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7.<init>()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r6.f6432a = r10     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cnt r8 = new cnt     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r8.<init>(r6)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r9 = "VideoAdServingTemplate"
            r7.mo3150a(r9, r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cnu r8 = new cnu     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r8.<init>(r6)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r9 = "VAST"
            r7.mo3150a(r9, r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r8.<init>()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r6.f6433b = r8     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.util.List r8 = r7.f6111a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r8.add(r6)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cob r8 = p000.cob.INLINE     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r6.f6434c = r8     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r8 = "VAST/Ad"
            java.lang.String r8 = r6.mo3364a(r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cne r9 = p000.cng.f6113a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7.mo3149a(r8, r9)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r8 = "VAST/Ad"
            java.lang.String r8 = r6.mo3364a(r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r9 = "id"
            java.lang.String r10 = "id"
            r7.mo3152a(r8, r9, r10)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r8 = "VAST/Ad"
            java.lang.String r8 = r6.mo3364a(r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r9 = "sequence"
            java.lang.String r10 = "sequence"
            r7.mo3152a(r8, r9, r10)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cob r8 = p000.cob.INLINE     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r6.mo3365a(r7, r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cob r8 = p000.cob.WRAPPER     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r6.mo3365a(r7, r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r8 = "VAST/Ad"
            java.lang.String r8 = r6.mo3364a(r8)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r9 = "addVideo"
            r7.mo3153b(r8, r9)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            r8.<init>(r4)     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            r7.mo3148a(r8)     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            r4.<init>()     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            java.util.List r7 = r6.f6433b     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
        L_0x023f:
            boolean r8 = r7.hasNext()     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            if (r8 == 0) goto L_0x0255
            java.lang.Object r8 = r7.next()     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder r8 = (com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder) r8     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            dje r8 = r8.mo4509g()     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            cmy r8 = (p000.cmy) r8     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            r4.add(r8)     // Catch:{ IOException -> 0x02d4, cnd -> 0x02df }
            goto L_0x023f
        L_0x0255:
            boolean r7 = r4.isEmpty()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            if (r7 == 0) goto L_0x026f
            cmy r4 = p000.cmy.f6064y     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            dja r4 = r4.mo4516l()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder r4 = (com.google.android.tvlauncher.doubleclick.proto.VideoCreative$VastXml$Builder) r4     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            int r6 = r6.f6432a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r4.setVastVersion(r6)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            dje r4 = r4.mo4509g()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmy r4 = (p000.cmy) r4     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            goto L_0x0276
        L_0x026f:
            java.lang.Object r4 = r4.get(r2)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmy r4 = (p000.cmy) r4     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
        L_0x0276:
            cmj r6 = p000.cmj.f5999e     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            dja r6 = r6.mo4516l()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            boolean r7 = r6.f8673b     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            if (r7 != 0) goto L_0x0281
            goto L_0x0286
        L_0x0281:
            r6.mo4505b()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r6.f8673b = r2     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
        L_0x0286:
            dje r7 = r6.f8672a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmj r7 = (p000.cmj) r7     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r5.getClass()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            int r8 = r7.f6000a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r1 = r1 | r8
            r7.f6000a = r1     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7.f6003d = r5     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r4.getClass()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7.f6002c = r4     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r1 = 3
            r7.f6001b = r1     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            dje r1 = r6.mo4509g()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmj r1 = (p000.cmj) r1     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmc r4 = p000.cmc.f5966f     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            dja r4 = r4.mo4516l()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 + r7
            boolean r7 = r4.f8673b     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            if (r7 != 0) goto L_0x02b5
            goto L_0x02ba
        L_0x02b5:
            r4.mo4505b()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r4.f8673b = r2     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
        L_0x02ba:
            dje r2 = r4.f8672a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmc r2 = (p000.cmc) r2     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            int r7 = r2.f5967a     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r7 = r7 | 4
            r2.f5967a = r7     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r2.f5970d = r5     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r1.getClass()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r2.f5969c = r1     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            r2.f5968b = r0     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            dje r0 = r4.mo4509g()     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            cmc r0 = (p000.cmc) r0     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            goto L_0x02e9
        L_0x02d4:
            r0 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            java.lang.String r1 = "This exception cannot happen. Digester creates an InputSource and  passes it to the XML parser, however that InputSource cannot throw IOException"
            r0.<init>(r1)     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
            throw r0     // Catch:{ cnd -> 0x02df, IOException -> 0x02dd }
        L_0x02dd:
            r0 = move-exception
            goto L_0x02e0
        L_0x02df:
            r0 = move-exception
        L_0x02e0:
            java.lang.String r1 = "VastParser"
            java.lang.String r2 = "Problem with vast ad format parsing..returning null"
            android.util.Log.e(r1, r2, r0)
            r0 = r3
        L_0x02e9:
            if (r0 == 0) goto L_0x02f0
            coc r0 = p000.coe.m5203a(r0)
            goto L_0x02f2
        L_0x02f0:
            r0 = r3
        L_0x02f2:
            if (r0 == 0) goto L_0x0334
            cmc r1 = r0.f5952l
            byte[] r1 = r1.mo4371j()
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r4 = r0.f5941a
            java.lang.String r5 = "poster_art_uri"
            r2.put(r5, r4)
            java.lang.String r4 = r0.f5942b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0316
            java.lang.String r0 = r0.f5942b
            java.lang.String r4 = "preview_video_uri"
            r2.put(r4, r0)
            goto L_0x031c
        L_0x0316:
            java.lang.String r0 = "preview_video_uri"
            r2.putNull(r0)
        L_0x031c:
            java.lang.String r0 = "internal_provider_data"
            r2.put(r0, r1)
            android.content.Context r0 = r11.f5903a
            android.content.ContentResolver r0 = r0.getContentResolver()
            long r4 = r11.f5904b
            android.net.Uri r1 = p000.C0484rw.f10283a
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r1, r4)
            r0.update(r1, r2, r3, r3)
            return
        L_0x0334:
            java.lang.String r0 = r11.f5905c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "AdLoaderTask: failed to create outstream video ad for ad id: "
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0348
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            goto L_0x034c
        L_0x0348:
            java.lang.String r0 = r1.concat(r0)
        L_0x034c:
            java.lang.String r1 = "AdsManager"
            android.util.Log.e(r1, r0)
            return
        L_0x0352:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.clg.run():void");
    }
}
