package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p116O4.InterfaceC1148d;
import p164V3.C1762g;
import p171W3.C1863b;
import p171W3.InterfaceC1862a;
import p200a4.C2210c;
import p200a4.C2224q;
import p200a4.InterfaceC2211d;
import p285k5.AbstractC6073h;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1862a lambda$getComponents$0(InterfaceC2211d interfaceC2211d) {
        return C1863b.m7658d((C1762g) interfaceC2211d.mo8953a(C1762g.class), (Context) interfaceC2211d.mo8953a(Context.class), (InterfaceC1148d) interfaceC2211d.mo8953a(InterfaceC1148d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C2210c> getComponents() {
        return Arrays.asList(C2210c.m8965e(InterfaceC1862a.class).m8983b(C2224q.m9033l(C1762g.class)).m8983b(C2224q.m9033l(Context.class)).m8983b(C2224q.m9033l(InterfaceC1148d.class)).m8987f(C4809a.f18420a).m8986e().m8985d(), AbstractC6073h.m27112b("fire-analytics", "23.0.0"));
    }
}
