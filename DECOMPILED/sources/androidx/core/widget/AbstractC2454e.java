package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.core.widget.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2454e {

    /* JADX INFO: renamed from: androidx.core.widget.e$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static ColorStateList m10740a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* JADX INFO: renamed from: b */
        static PorterDuff.Mode m10741b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* JADX INFO: renamed from: c */
        static void m10742c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* JADX INFO: renamed from: d */
        static void m10743d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m10736a(ImageView imageView) {
        return a.m10740a(imageView);
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m10737b(ImageView imageView) {
        return a.m10741b(imageView);
    }

    /* JADX INFO: renamed from: c */
    public static void m10738c(ImageView imageView, ColorStateList colorStateList) {
        a.m10742c(imageView, colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m10739d(ImageView imageView, PorterDuff.Mode mode) {
        a.m10743d(imageView, mode);
    }
}
