package p111O;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: O.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1076u {

    /* JADX INFO: renamed from: a */
    private static boolean f3913a = false;

    /* JADX INFO: renamed from: b */
    private static Method f3914b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f3915c = false;

    /* JADX INFO: renamed from: d */
    private static Field f3916d;

    /* JADX INFO: renamed from: O.u$a */
    public interface a {
        /* JADX INFO: renamed from: E */
        boolean mo418E(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m4773a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3913a) {
            try {
                f3914b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f3913a = true;
        }
        Method method = f3914b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m4774b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m4773a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC1030Z.m4469h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m4775c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM4778f = m4778f(dialog);
        if (onKeyListenerM4778f != null && onKeyListenerM4778f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC1030Z.m4469h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m4776d(View view, KeyEvent keyEvent) {
        return AbstractC1030Z.m4471i(view, keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4777e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo418E(keyEvent);
        }
        if (callback instanceof Activity) {
            return m4774b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m4775c((Dialog) callback, keyEvent);
        }
        return (view != null && AbstractC1030Z.m4469h(view, keyEvent)) || aVar.mo418E(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    private static DialogInterface.OnKeyListener m4778f(Dialog dialog) {
        if (!f3915c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3916d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3915c = true;
        }
        Field field = f3916d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
