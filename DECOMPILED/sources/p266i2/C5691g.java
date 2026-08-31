package p266i2;

import p138R5.InterfaceC1380a;
import p234e2.AbstractC5338d;
import p234e2.InterfaceC5336b;
import p274j2.AbstractC5843f;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: i2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5691g implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f21731a;

    public C5691g(InterfaceC1380a interfaceC1380a) {
        this.f21731a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC5843f m25243a(InterfaceC6328a interfaceC6328a) {
        return (AbstractC5843f) AbstractC5338d.m24331d(AbstractC5690f.m25242a(interfaceC6328a));
    }

    /* JADX INFO: renamed from: b */
    public static C5691g m25244b(InterfaceC1380a interfaceC1380a) {
        return new C5691g(interfaceC1380a);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC5843f get() {
        return m25243a((InterfaceC6328a) this.f21731a.get());
    }
}
