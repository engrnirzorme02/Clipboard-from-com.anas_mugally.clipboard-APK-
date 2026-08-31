package com.google.firebase.sessions;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p173W5.InterfaceC1879i;
import p174X.InterfaceC1905i;
import p317o5.AbstractC6596d;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: com.google.firebase.sessions.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5018d implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f19028a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1380a f19029b;

    public C5018d(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        this.f19028a = interfaceC1380a;
        this.f19029b = interfaceC1380a2;
    }

    /* JADX INFO: renamed from: a */
    public static C5018d m22590a(InterfaceC1380a interfaceC1380a, InterfaceC1380a interfaceC1380a2) {
        return new C5018d(interfaceC1380a, interfaceC1380a2);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1905i m22591c(Context context, InterfaceC1879i interfaceC1879i) {
        return (InterfaceC1905i) AbstractC6596d.m27936d(InterfaceC5016b.b.f19025a.m22583i(context, interfaceC1879i));
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC1905i get() {
        return m22591c((Context) this.f19028a.get(), (InterfaceC1879i) this.f19029b.get());
    }
}
