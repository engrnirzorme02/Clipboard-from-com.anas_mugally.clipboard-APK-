package p173W5;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1436n;
import p145S5.C1444v;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: W5.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1877g {
    /* JADX INFO: renamed from: a */
    public static final void m7778a(InterfaceC5371p interfaceC5371p, Object obj, InterfaceC1875e completion) {
        AbstractC6118n.m27187e(interfaceC5371p, "<this>");
        AbstractC6118n.m27187e(completion, "completion");
        InterfaceC1875e interfaceC1875eC = AbstractC2005b.m8367c(AbstractC2005b.m8365a(interfaceC5371p, obj, completion));
        C1436n.a aVar = C1436n.f4958b;
        interfaceC1875eC.resumeWith(C1436n.m6073b(C1444v.f4971a));
    }
}
