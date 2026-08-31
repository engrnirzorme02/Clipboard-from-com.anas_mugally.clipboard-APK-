package p266i2;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p234e2.AbstractC5338d;
import p234e2.InterfaceC5336b;
import p274j2.AbstractC5843f;
import p274j2.InterfaceC5861x;
import p282k2.InterfaceC5995d;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: i2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5693i implements InterfaceC5336b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f21732a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f21733b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f21734c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1380a f21735d;

    public C5693i(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4) {
        this.f21732a = interfaceC1380a;
        this.f21733b = interfaceC1380a2;
        this.f21734c = interfaceC1380a3;
        this.f21735d = interfaceC1380a4;
    }

    /* JADX INFO: renamed from: a */
    public static C5693i m25247a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3, InterfaceC1380a interfaceC1380a4) {
        return new C5693i(interfaceC1380a, interfaceC1380a2, interfaceC1380a3, interfaceC1380a4);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC5861x m25248c(Context context, InterfaceC5995d interfaceC5995d, AbstractC5843f abstractC5843f, InterfaceC6328a interfaceC6328a) {
        return (InterfaceC5861x) AbstractC5338d.m24331d(AbstractC5692h.m25246a(context, interfaceC5995d, abstractC5843f, interfaceC6328a));
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5861x get() {
        return m25248c((Context) this.f21732a.get(), (InterfaceC5995d) this.f21733b.get(), (AbstractC5843f) this.f21734c.get(), (InterfaceC6328a) this.f21735d.get());
    }
}
