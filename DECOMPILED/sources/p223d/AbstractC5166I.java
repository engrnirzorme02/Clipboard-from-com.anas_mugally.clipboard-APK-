package p223d;

import androidx.lifecycle.InterfaceC2657s;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: d.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5166I {

    /* JADX INFO: renamed from: d.I$a */
    public static final class a extends AbstractC5158A {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5367l f19768d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z7, InterfaceC5367l interfaceC5367l) {
            super(z7);
            this.f19768d = interfaceC5367l;
        }

        @Override // p223d.AbstractC5158A
        /* JADX INFO: renamed from: d */
        public void mo363d() {
            this.f19768d.invoke(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC5158A m23949a(C5165H c5165h, InterfaceC2657s interfaceC2657s, boolean z7, InterfaceC5367l onBackPressed) {
        AbstractC6118n.m27187e(c5165h, "<this>");
        AbstractC6118n.m27187e(onBackPressed, "onBackPressed");
        a aVar = new a(z7, onBackPressed);
        if (interfaceC2657s != null) {
            c5165h.m23936o(interfaceC2657s, aVar);
            return aVar;
        }
        c5165h.m23937p(aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC5158A m23950b(C5165H c5165h, InterfaceC2657s interfaceC2657s, boolean z7, InterfaceC5367l interfaceC5367l, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            interfaceC2657s = null;
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return m23949a(c5165h, interfaceC2657s, z7, interfaceC5367l);
    }
}
