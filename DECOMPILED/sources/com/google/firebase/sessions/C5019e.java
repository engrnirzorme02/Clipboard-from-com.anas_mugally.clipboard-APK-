package com.google.firebase.sessions;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p173W5.InterfaceC1879i;
import p174X.InterfaceC1905i;
import p301m5.C6352F;
import p317o5.AbstractC6596d;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: com.google.firebase.sessions.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5019e implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f19030a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f19031b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1380a f19032c;

    public C5019e(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        this.f19030a = interfaceC1380a;
        this.f19031b = interfaceC1380a2;
        this.f19032c = interfaceC1380a3;
    }

    /* JADX INFO: renamed from: a */
    public static C5019e m22593a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2, InterfaceC1380a interfaceC1380a3) {
        return new C5019e(interfaceC1380a, interfaceC1380a2, interfaceC1380a3);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1905i m22594c(Context context, InterfaceC1879i interfaceC1879i, C6352F c6352f) {
        return (InterfaceC1905i) AbstractC6596d.m27936d(InterfaceC5016b.b.f19025a.m22584l(context, interfaceC1879i, c6352f));
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1905i get() {
        return m22594c((Context) this.f19030a.get(), (InterfaceC1879i) this.f19031b.get(), (C6352F) this.f19032c.get());
    }
}
