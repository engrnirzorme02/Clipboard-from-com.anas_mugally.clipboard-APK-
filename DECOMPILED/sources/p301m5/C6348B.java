package p301m5;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: m5.B */
/* JADX INFO: loaded from: classes.dex */
public final class C6348B implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f24207a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f24208b;

    public C6348B(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        this.f24207a = interfaceC1380a;
        this.f24208b = interfaceC1380a2;
    }

    /* JADX INFO: renamed from: a */
    public static C6348B m27368a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        return new C6348B(interfaceC1380a, interfaceC1380a2);
    }

    /* JADX INFO: renamed from: c */
    public static C6347A m27369c(Context context, InterfaceC6371Z interfaceC6371Z) {
        return new C6347A(context, interfaceC6371Z);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6347A get() {
        return m27369c((Context) this.f24207a.get(), (InterfaceC6371Z) this.f24208b.get());
    }
}
