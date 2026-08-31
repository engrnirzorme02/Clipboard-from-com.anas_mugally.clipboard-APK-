package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;
import p312o0.AbstractC6513c;
import p312o0.C6512b;
import p312o0.C6516f;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: androidx.lifecycle.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2633Z {

    /* JADX INFO: renamed from: a */
    private static final C6516f f10442a = new C6516f();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6624N m12590a(AbstractC2632Y abstractC2632Y) {
        C6512b c6512bM27744a;
        AbstractC6118n.m27187e(abstractC2632Y, "<this>");
        synchronized (f10442a) {
            c6512bM27744a = (C6512b) abstractC2632Y.m12589c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (c6512bM27744a == null) {
                c6512bM27744a = AbstractC6513c.m27744a();
                abstractC2632Y.m12587a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c6512bM27744a);
            }
        }
        return c6512bM27744a;
    }
}
