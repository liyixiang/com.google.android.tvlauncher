package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abq */
/* compiled from: PG */
public final class abq implements aaj {

    /* renamed from: a */
    private static final Set f56a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: b */
    private final aaj f57b;

    public abq(aaj aaj) {
        this.f57b = aaj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        return this.f57b.mo11a(new C0699zv(((Uri) obj).toString()), i, i2, txVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        return f56a.contains(((Uri) obj).getScheme());
    }
}
