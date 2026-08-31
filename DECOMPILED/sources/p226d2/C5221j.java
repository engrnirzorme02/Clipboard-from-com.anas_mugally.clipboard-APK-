package p226d2;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p234e2.InterfaceC5336b;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: d2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5221j implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f19937a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f19938b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f19939c;

    public C5221j(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        this.f19937a = interfaceC1380a;
        this.f19938b = interfaceC1380a2;
        this.f19939c = interfaceC1380a3;
    }

    /* JADX INFO: renamed from: a */
    public static C5221j m24136a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        return new C5221j(interfaceC1380a, interfaceC1380a2, interfaceC1380a3);
    }

    /* JADX INFO: renamed from: c */
    public static C5220i m24137c(Context context, InterfaceC6328a interfaceC6328a, InterfaceC6328a interfaceC6328a2) {
        return new C5220i(context, interfaceC6328a, interfaceC6328a2);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5220i get() {
        return m24137c((Context) this.f19937a.get(), (InterfaceC6328a) this.f19938b.get(), (InterfaceC6328a) this.f19939c.get());
    }
}
