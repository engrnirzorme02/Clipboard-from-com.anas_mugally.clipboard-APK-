package p360t6;

import kotlin.coroutines.jvm.internal.AbstractC6086a;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p195a.C2170a;

/* JADX INFO: renamed from: t6.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7103C {

    /* JADX INFO: renamed from: a */
    private static final StackTraceElement f28392a = new C2170a().m8792a();

    /* JADX INFO: renamed from: b */
    private static final String f28393b;

    /* JADX INFO: renamed from: c */
    private static final String f28394c;

    static {
        Object objM6073b;
        Object objM6073b2;
        try {
            C1436n.a aVar = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC6086a.class.getCanonicalName());
        } catch (Throwable th) {
            C1436n.a aVar2 = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(th));
        }
        if (C1436n.m6075d(objM6073b) != null) {
            objM6073b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f28393b = (String) objM6073b;
        try {
            objM6073b2 = C1436n.m6073b(AbstractC7103C.class.getCanonicalName());
        } catch (Throwable th2) {
            C1436n.a aVar3 = C1436n.f4958b;
            objM6073b2 = C1436n.m6073b(AbstractC1437o.m6081a(th2));
        }
        if (C1436n.m6075d(objM6073b2) != null) {
            objM6073b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f28394c = (String) objM6073b2;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m31385a(Throwable th) {
        return th;
    }
}
