package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: crg */
/* compiled from: PG */
public final class crg extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
