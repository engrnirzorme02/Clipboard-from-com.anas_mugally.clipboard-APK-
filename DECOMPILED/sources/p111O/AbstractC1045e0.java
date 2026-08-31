package p111O;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import p009B.AbstractC0040c;

/* JADX INFO: renamed from: O.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1045e0 {

    /* JADX INFO: renamed from: a */
    private static final WindowInsets f3855a = C0982A0.f3748b.m4288w();

    /* JADX INFO: renamed from: b */
    static boolean f3856b = false;

    /* JADX INFO: renamed from: O.e0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m4660a(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WindowInsets m4657a(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        windowInsetsArr[0] = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets) : view.onApplyWindowInsets(windowInsets);
        return f3855a;
    }

    /* JADX INFO: renamed from: b */
    static WindowInsets m4658b(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(AbstractC0040c.f296M);
        Object tag2 = view.getTag(AbstractC0040c.f303T);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        final WindowInsets[] windowInsetsArr = {f3855a};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: O.d0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return AbstractC1045e0.m4657a(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(AbstractC0040c.f295L);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                m4658b(viewGroup.getChildAt(i7), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets3 = windowInsetsArr[0];
        return windowInsets3 != null ? windowInsets3 : f3855a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m4659c(ViewGroup viewGroup) {
        return a.m4660a(viewGroup);
    }
}
