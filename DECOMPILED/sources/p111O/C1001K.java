package p111O;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: renamed from: O.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1001K {

    /* JADX INFO: renamed from: a */
    private final PointerIcon f3789a;

    /* JADX INFO: renamed from: O.K$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static PointerIcon m4380a(Context context, int i7) {
            return PointerIcon.getSystemIcon(context, i7);
        }
    }

    private C1001K(PointerIcon pointerIcon) {
        this.f3789a = pointerIcon;
    }

    /* JADX INFO: renamed from: b */
    public static C1001K m4378b(Context context, int i7) {
        return new C1001K(a.m4380a(context, i7));
    }

    /* JADX INFO: renamed from: a */
    public Object m4379a() {
        return this.f3789a;
    }
}
