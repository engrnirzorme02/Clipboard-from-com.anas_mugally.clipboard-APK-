package p111O;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.C3553a;
import java.util.Objects;
import p104N.InterfaceC0911h;

/* JADX INFO: renamed from: O.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1039c0 {

    /* JADX INFO: renamed from: O.c0$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static float m4631a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* JADX INFO: renamed from: b */
        static float m4632b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: O.c0$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static boolean m4633a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: O.c0$c */
    static class c {
        /* JADX INFO: renamed from: a */
        static int m4634a(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i7, i8, i9);
        }

        /* JADX INFO: renamed from: b */
        static int m4635b(ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i7, i8, i9);
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m4621a(Resources resources, int i7, InterfaceC0911h interfaceC0911h, int i8) {
        int dimensionPixelSize;
        if (i7 != -1) {
            return (i7 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i7)) < 0) ? i8 : dimensionPixelSize;
        }
        return ((Integer) interfaceC0911h.get()).intValue();
    }

    /* JADX INFO: renamed from: b */
    private static int m4622b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    /* JADX INFO: renamed from: c */
    private static int m4623c(Resources resources, int i7, int i8) {
        if (i7 == 4194304 && i8 == 26) {
            return m4622b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    private static int m4624d(Resources resources, int i7, int i8) {
        if (i7 == 4194304 && i8 == 26) {
            return m4622b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static float m4625e(ViewConfiguration viewConfiguration, Context context) {
        return a.m4631a(viewConfiguration);
    }

    /* JADX INFO: renamed from: f */
    public static int m4626f(Context context, final ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m4634a(viewConfiguration, i7, i8, i9);
        }
        if (!m4629i(i7, i8, i9)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iM4623c = m4623c(resources, i9, i8);
        Objects.requireNonNull(viewConfiguration);
        return m4621a(resources, iM4623c, new InterfaceC0911h() { // from class: O.a0
            @Override // p104N.InterfaceC0911h
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public static int m4627g(Context context, final ViewConfiguration viewConfiguration, int i7, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.m4635b(viewConfiguration, i7, i8, i9);
        }
        if (!m4629i(i7, i8, i9)) {
            return C3553a.e.API_PRIORITY_OTHER;
        }
        Resources resources = context.getResources();
        int iM4624d = m4624d(resources, i9, i8);
        Objects.requireNonNull(viewConfiguration);
        return m4621a(resources, iM4624d, new InterfaceC0911h() { // from class: O.b0
            @Override // p104N.InterfaceC0911h
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, C3553a.e.API_PRIORITY_OTHER);
    }

    /* JADX INFO: renamed from: h */
    public static float m4628h(ViewConfiguration viewConfiguration, Context context) {
        return a.m4632b(viewConfiguration);
    }

    /* JADX INFO: renamed from: i */
    private static boolean m4629i(int i7, int i8, int i9) {
        InputDevice device = InputDevice.getDevice(i7);
        return (device == null || device.getMotionRange(i8, i9) == null) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4630j(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m4633a(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iM4622b = m4622b(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iM4622b != 0 && resources.getBoolean(iM4622b);
    }
}
