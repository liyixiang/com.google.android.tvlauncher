package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: boc */
/* compiled from: PG */
public class boc {

    /* renamed from: a */
    private static Context f4502a;

    /* renamed from: a */
    private static long m3814a(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: a */
    private static long m3815a(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: a */
    public static /* synthetic */ String m3817a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    /* renamed from: a */
    public void mo2223a(RecyclerView recyclerView, C0285km kmVar, int i) {
    }

    /* renamed from: a */
    public static long m3816a(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i = 37;
        long j = -7286425919675154353L;
        if (length > 32) {
            if (length <= 64) {
                long j2 = ((long) (length + length)) - 7286425919675154353L;
                long b = m3820b(bArr2, 0) * -7286425919675154353L;
                long b2 = m3820b(bArr2, 8);
                long b3 = m3820b(bArr2, length - 8) * j2;
                long j3 = j2;
                long rotateRight = Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (m3820b(bArr2, length - 16) * -7286425919675154353L);
                long rotateRight2 = Long.rotateRight(b2 - 7286425919675154353L, 18);
                long b4 = m3820b(bArr2, 16) * j3;
                long b5 = m3820b(bArr2, 24);
                long b6 = (rotateRight + m3820b(bArr2, length - 32)) * j3;
                long j4 = j3;
                return m3815a(Long.rotateRight(b4 + b5, 43) + Long.rotateRight(b6, 30) + ((m3815a(rotateRight, b + rotateRight2 + b3, j4) + m3820b(bArr2, length - 24)) * j3), b4 + Long.rotateRight(b5 + b, 18) + b6, j4);
            }
            long a = m3814a(-7956866745689871395L) * -7286425919675154353L;
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long b7 = m3820b(bArr2, 0) + 95310865018149119L;
            int i2 = length - 1;
            int i3 = (i2 >> 6) << 6;
            int i4 = i2 & 63;
            int i5 = (i3 + i4) - 63;
            long j5 = 2480279821605975764L;
            int i6 = 0;
            while (true) {
                long rotateRight3 = Long.rotateRight(b7 + j5 + jArr[0] + m3820b(bArr2, i6 + 8), i);
                long rotateRight4 = Long.rotateRight(j5 + jArr[1] + m3820b(bArr2, i6 + 48), 42);
                long j6 = (rotateRight3 * -5435081209227447693L) ^ jArr2[1];
                long b8 = (rotateRight4 * -5435081209227447693L) + jArr[0] + m3820b(bArr2, i6 + 40);
                long rotateRight5 = Long.rotateRight(a + jArr2[0], 33) * -5435081209227447693L;
                int i7 = i4;
                m3819a(bArr, i6, jArr[1] * -5435081209227447693L, j6 + jArr2[0], jArr);
                m3819a(bArr, i6 + 32, rotateRight5 + jArr2[1], b8 + m3820b(bArr2, i6 + 16), jArr2);
                int i8 = i6 + 64;
                if (i8 == i3) {
                    long j7 = j6 & 255;
                    long j8 = -5435081209227447693L + j7 + j7;
                    long j9 = jArr2[0] + ((long) i7);
                    long j10 = jArr[0] + j9;
                    jArr[0] = j10;
                    jArr2[0] = j9 + j10;
                    long rotateRight6 = Long.rotateRight(rotateRight5 + b8 + j10 + m3820b(bArr2, i5 + 8), 37);
                    long rotateRight7 = Long.rotateRight(b8 + jArr[1] + m3820b(bArr2, i5 + 48), 42);
                    long j11 = (rotateRight6 * j8) ^ (jArr2[1] * 9);
                    long b9 = (rotateRight7 * j8) + (jArr[0] * 9) + m3820b(bArr2, i5 + 40);
                    long rotateRight8 = Long.rotateRight(j6 + jArr2[0], 33) * j8;
                    m3819a(bArr, i5, jArr[1] * j8, j11 + jArr2[0], jArr);
                    m3819a(bArr, i5 + 32, rotateRight8 + jArr2[1], b9 + m3820b(bArr2, i5 + 16), jArr2);
                    long j12 = j8;
                    return m3815a(m3815a(jArr[0], jArr2[0], j12) + (m3814a(b9) * -4348849565147123417L) + j11, m3815a(jArr[1], jArr2[1], j12) + rotateRight8, j12);
                }
                i6 = i8;
                i4 = i7;
                a = j6;
                j5 = b8;
                b7 = rotateRight5;
                i = 37;
            }
        } else if (length > 16) {
            long j13 = ((long) (length + length)) - 7286425919675154353L;
            long b10 = m3820b(bArr2, 0) * -5435081209227447693L;
            long b11 = m3820b(bArr2, 8);
            long b12 = m3820b(bArr2, length - 8) * j13;
            return m3815a(Long.rotateRight(b10 + b11, 43) + Long.rotateRight(b12, 30) + (m3820b(bArr2, length - 16) * -7286425919675154353L), b10 + Long.rotateRight(b11 - 7286425919675154353L, 18) + b12, j13);
        } else {
            if (length >= 8) {
                long j14 = ((long) (length + length)) - 7286425919675154353L;
                long b13 = m3820b(bArr2, 0) - 7286425919675154353L;
                long b14 = m3820b(bArr2, length - 8);
                j = m3815a((Long.rotateRight(b14, 37) * j14) + b13, (Long.rotateRight(b13, 25) + b14) * j14, j14);
            } else if (length >= 4) {
                return m3815a(((long) length) + ((((long) m3813a(bArr2, 0)) & 4294967295L) << 3), ((long) m3813a(bArr2, length - 4)) & 4294967295L, ((long) (length + length)) - 7286425919675154353L);
            } else {
                if (length > 0) {
                    return -7286425919675154353L * m3814a((((long) (length + ((bArr2[length - 1] & 255) << 2))) * -4348849565147123417L) ^ (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * -7286425919675154353L));
                }
            }
            return j;
        }
    }

    /* renamed from: a */
    private static int m3813a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    private static long m3820b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    /* renamed from: a */
    private static void m3819a(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = m3820b(bArr, i);
        long b2 = m3820b(bArr, i + 8);
        long b3 = m3820b(bArr, i + 16);
        long b4 = m3820b(bArr, i + 24);
        long j3 = j + b;
        long rotateRight = Long.rotateRight(j2 + j3 + b4, 21);
        long j4 = b2 + j3 + b3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + b4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m3818a(android.content.Context r2) {
        /*
            java.lang.Class<boc> r0 = p000.boc.class
            monitor-enter(r0)
            android.content.Context r1 = p000.boc.f4502a     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x000f
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            p000.boc.f4502a = r2     // Catch:{ all -> 0x001a }
        L_0x000f:
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.boc.m3818a(android.content.Context):void");
    }
}
