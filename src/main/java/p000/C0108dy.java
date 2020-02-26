package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: dy */
/* compiled from: PG */
public final class C0108dy {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static float m7224a(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    /* renamed from: b */
    public static float m7226b(ViewConfiguration viewConfiguration) {
        int i = Build.VERSION.SDK_INT;
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    /* renamed from: a */
    public static boolean m7225a(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
