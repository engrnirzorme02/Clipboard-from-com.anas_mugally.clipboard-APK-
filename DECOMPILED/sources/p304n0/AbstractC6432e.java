package p304n0;

import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.C2635a0;
import kotlin.jvm.internal.AbstractC6118n;
import p230d6.AbstractC5245a;
import p286k6.InterfaceC6077c;

/* JADX INFO: renamed from: n0.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6432e {
    /* JADX INFO: renamed from: a */
    public static final AbstractC2632Y m27648a(C2635a0.c factory, InterfaceC6077c modelClass, AbstractC6428a extras) {
        AbstractC6118n.m27187e(factory, "factory");
        AbstractC6118n.m27187e(modelClass, "modelClass");
        AbstractC6118n.m27187e(extras, "extras");
        try {
            try {
                return factory.mo12562b(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return factory.mo12451a(AbstractC5245a.m24241a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return factory.mo12570c(AbstractC5245a.m24241a(modelClass), extras);
        }
    }
}
