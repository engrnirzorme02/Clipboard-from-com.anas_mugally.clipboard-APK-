package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p041F.AbstractC0400a;

/* JADX INFO: renamed from: androidx.appcompat.widget.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2315M {

    /* JADX INFO: renamed from: a */
    private static final int[] f7921a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    private static final int[] f7922b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f7923c = new Rect();

    /* JADX INFO: renamed from: androidx.appcompat.widget.M$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private static final boolean f7924a;

        /* JADX INFO: renamed from: b */
        private static final Method f7925b;

        /* JADX INFO: renamed from: c */
        private static final Field f7926c;

        /* JADX INFO: renamed from: d */
        private static final Field f7927d;

        /* JADX INFO: renamed from: e */
        private static final Field f7928e;

        /* JADX INFO: renamed from: f */
        private static final Field f7929f;

        /* JADX WARN: Code duplicated, block: B:25:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z7;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z7 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z7 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z7 = false;
                        if (z7) {
                            f7925b = method;
                            f7926c = field;
                            f7927d = field2;
                            f7928e = field3;
                            f7929f = field4;
                            f7924a = true;
                            return;
                        }
                        f7925b = null;
                        f7926c = null;
                        f7927d = null;
                        f7928e = null;
                        f7929f = null;
                        f7924a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z7 = false;
                        if (z7) {
                            f7925b = method;
                            f7926c = field;
                            f7927d = field2;
                            f7928e = field3;
                            f7929f = field4;
                            f7924a = true;
                            return;
                        }
                        f7925b = null;
                        f7926c = null;
                        f7927d = null;
                        f7928e = null;
                        f7929f = null;
                        f7924a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z7 = false;
                        if (z7) {
                            f7925b = method;
                            f7926c = field;
                            f7927d = field2;
                            f7928e = field3;
                            f7929f = field4;
                            f7924a = true;
                            return;
                        }
                        f7925b = null;
                        f7926c = null;
                        f7927d = null;
                        f7928e = null;
                        f7929f = null;
                        f7924a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z7 = false;
                    if (z7) {
                        f7925b = method;
                        f7926c = field;
                        f7927d = field2;
                        f7928e = field3;
                        f7929f = field4;
                        f7924a = true;
                        return;
                    }
                    f7925b = null;
                    f7926c = null;
                    f7927d = null;
                    f7928e = null;
                    f7929f = null;
                    f7924a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z7 = false;
                    if (z7) {
                        f7925b = method;
                        f7926c = field;
                        f7927d = field2;
                        f7928e = field3;
                        f7929f = field4;
                        f7924a = true;
                        return;
                    }
                    f7925b = null;
                    f7926c = null;
                    f7927d = null;
                    f7928e = null;
                    f7929f = null;
                    f7924a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z7 = false;
                    if (z7) {
                        f7925b = method;
                        f7926c = field;
                        f7927d = field2;
                        f7928e = field3;
                        f7929f = field4;
                        f7924a = true;
                        return;
                    }
                    f7925b = null;
                    f7926c = null;
                    f7927d = null;
                    f7928e = null;
                    f7929f = null;
                    f7924a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z7) {
                f7925b = method;
                f7926c = field;
                f7927d = field2;
                f7928e = field3;
                f7929f = field4;
                f7924a = true;
                return;
            }
            f7925b = null;
            f7926c = null;
            f7927d = null;
            f7928e = null;
            f7929f = null;
            f7924a = false;
        }

        /* JADX INFO: renamed from: a */
        static Rect m9772a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f7924a) {
                try {
                    Object objInvoke = f7925b.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(f7926c.getInt(objInvoke), f7927d.getInt(objInvoke), f7928e.getInt(objInvoke), f7929f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return AbstractC2315M.f7923c;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.M$b */
    static class b {
        /* JADX INFO: renamed from: a */
        static Insets m9773a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9767a(Drawable drawable) {
        return true;
    }

    /* JADX INFO: renamed from: b */
    static void m9768b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 29 || i7 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        m9769c(drawable);
    }

    /* JADX INFO: renamed from: c */
    private static void m9769c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f7921a);
        } else {
            drawable.setState(f7922b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: d */
    public static Rect m9770d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.m9772a(AbstractC0400a.m1711q(drawable));
        }
        Insets insetsM9773a = b.m9773a(drawable);
        return new Rect(insetsM9773a.left, insetsM9773a.top, insetsM9773a.right, insetsM9773a.bottom);
    }

    /* JADX INFO: renamed from: e */
    public static PorterDuff.Mode m9771e(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
