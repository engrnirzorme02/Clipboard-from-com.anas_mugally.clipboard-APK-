package p312o0;

import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.lifecycle.InterfaceC2648j;
import kotlin.jvm.internal.AbstractC6118n;
import p286k6.InterfaceC6077c;
import p304n0.AbstractC6428a;

/* JADX INFO: renamed from: o0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6518h {

    /* JADX INFO: renamed from: a */
    public static final C6518h f24643a = new C6518h();

    private C6518h() {
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC6428a m27753a(InterfaceC2639c0 owner) {
        AbstractC6118n.m27187e(owner, "owner");
        return owner instanceof InterfaceC2648j ? ((InterfaceC2648j) owner).mo11962q() : AbstractC6428a.b.f24472c;
    }

    /* JADX INFO: renamed from: b */
    public final C2635a0.c m27754b(InterfaceC2639c0 owner) {
        AbstractC6118n.m27187e(owner, "owner");
        return owner instanceof InterfaceC2648j ? ((InterfaceC2648j) owner).mo11961p() : C6514d.f24637b;
    }

    /* JADX INFO: renamed from: c */
    public final String m27755c(InterfaceC6077c modelClass) {
        AbstractC6118n.m27187e(modelClass, "modelClass");
        String strM27743a = AbstractC6511a.m27743a(modelClass);
        if (strM27743a == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strM27743a;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2632Y m27756d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
