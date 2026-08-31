package com.google.firebase.sessions;

import p138R5.InterfaceC1380a;
import p164V3.C1762g;
import p301m5.C6374b;
import p317o5.AbstractC6596d;
import p317o5.InterfaceC6594b;

/* JADX INFO: renamed from: com.google.firebase.sessions.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5017c implements InterfaceC6594b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1380a f19027a;

    public C5017c(InterfaceC1380a interfaceC1380a) {
        this.f19027a = interfaceC1380a;
    }

    /* JADX INFO: renamed from: a */
    public static C6374b m22587a(C1762g c1762g) {
        return (C6374b) AbstractC6596d.m27936d(InterfaceC5016b.b.f19025a.m22582e(c1762g));
    }

    /* JADX INFO: renamed from: b */
    public static C5017c m22588b(InterfaceC1380a interfaceC1380a) {
        return new C5017c(interfaceC1380a);
    }

    @Override // p138R5.InterfaceC1380a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6374b get() {
        return m22587a((C1762g) this.f19027a.get());
    }
}
