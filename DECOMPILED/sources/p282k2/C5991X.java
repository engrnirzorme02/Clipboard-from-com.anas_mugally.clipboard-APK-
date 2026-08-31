package p282k2;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p234e2.InterfaceC5336b;

/* JADX INFO: renamed from: k2.X */
/* JADX INFO: loaded from: classes.dex */
public final class C5991X implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f23750a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f23751b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f23752c;

    public C5991X(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        this.f23750a = interfaceC1380a;
        this.f23751b = interfaceC1380a2;
        this.f23752c = interfaceC1380a3;
    }

    /* JADX INFO: renamed from: a */
    public static C5991X m27004a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        return new C5991X(interfaceC1380a, interfaceC1380a2, interfaceC1380a3);
    }

    /* JADX INFO: renamed from: c */
    public static C5990W m27005c(Context context, String str, int i7) {
        return new C5990W(context, str, i7);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5990W get() {
        return m27005c((Context) this.f23750a.get(), (String) this.f23751b.get(), ((Integer) this.f23752c.get()).intValue());
    }
}
