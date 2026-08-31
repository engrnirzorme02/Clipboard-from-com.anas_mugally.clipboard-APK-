package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.core.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2452c {

    /* JADX INFO: renamed from: androidx.core.widget.c$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static ColorStateList m10723a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* JADX INFO: renamed from: b */
        static PorterDuff.Mode m10724b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* JADX INFO: renamed from: c */
        static void m10725c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        static void m10726d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.c$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static Drawable m10727a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m10718a(CompoundButton compoundButton) {
        return b.m10727a(compoundButton);
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m10719b(CompoundButton compoundButton) {
        return a.m10723a(compoundButton);
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m10720c(CompoundButton compoundButton) {
        return a.m10724b(compoundButton);
    }

    /* JADX INFO: renamed from: d */
    public static void m10721d(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.m10725c(compoundButton, colorStateList);
    }

    /* JADX INFO: renamed from: e */
    public static void m10722e(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.m10726d(compoundButton, mode);
    }
}
