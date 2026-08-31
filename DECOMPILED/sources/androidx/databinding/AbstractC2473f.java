package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.databinding.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2473f {

    /* JADX INFO: renamed from: a */
    private static AbstractC2471d f9398a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: a */
    public static AbstractC2474g m10822a(View view) {
        return m10823b(view, null);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2474g m10823b(View view, InterfaceC2472e interfaceC2472e) {
        AbstractC2474g abstractC2474gM10827f = m10827f(view);
        if (abstractC2474gM10827f != null) {
            return abstractC2474gM10827f;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int iMo10819d = f9398a.mo10819d((String) tag);
        if (iMo10819d != 0) {
            return f9398a.mo10817b(interfaceC2472e, view, iMo10819d);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    /* JADX INFO: renamed from: c */
    static AbstractC2474g m10824c(InterfaceC2472e interfaceC2472e, View view, int i7) {
        return f9398a.mo10817b(interfaceC2472e, view, i7);
    }

    /* JADX INFO: renamed from: d */
    static AbstractC2474g m10825d(InterfaceC2472e interfaceC2472e, View[] viewArr, int i7) {
        return f9398a.mo10818c(interfaceC2472e, viewArr, i7);
    }

    /* JADX INFO: renamed from: e */
    private static AbstractC2474g m10826e(InterfaceC2472e interfaceC2472e, ViewGroup viewGroup, int i7, int i8) {
        int childCount = viewGroup.getChildCount();
        int i9 = childCount - i7;
        if (i9 == 1) {
            return m10824c(interfaceC2472e, viewGroup.getChildAt(childCount - 1), i8);
        }
        View[] viewArr = new View[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            viewArr[i10] = viewGroup.getChildAt(i10 + i7);
        }
        return m10825d(interfaceC2472e, viewArr, i8);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC2474g m10827f(View view) {
        return AbstractC2474g.m10840j(view);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC2472e m10828g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC2474g m10829h(LayoutInflater layoutInflater, int i7, ViewGroup viewGroup, boolean z7) {
        return m10830i(layoutInflater, i7, viewGroup, z7, null);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2474g m10830i(LayoutInflater layoutInflater, int i7, ViewGroup viewGroup, boolean z7, InterfaceC2472e interfaceC2472e) {
        boolean z8 = viewGroup != null && z7;
        return z8 ? m10826e(interfaceC2472e, viewGroup, z8 ? viewGroup.getChildCount() : 0, i7) : m10824c(interfaceC2472e, layoutInflater.inflate(i7, viewGroup, z7), i7);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2474g m10831j(Activity activity, int i7) {
        return m10832k(activity, i7, null);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC2474g m10832k(Activity activity, int i7, InterfaceC2472e interfaceC2472e) {
        activity.setContentView(i7);
        return m10826e(interfaceC2472e, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i7);
    }
}
