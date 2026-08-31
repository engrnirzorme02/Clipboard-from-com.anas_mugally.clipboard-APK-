package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.protobuf.h0 */
/* JADX INFO: loaded from: classes.dex */
final class C5103h0 {

    /* JADX INFO: renamed from: c */
    private static final C5103h0 f19398c = new C5103h0();

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f19400b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private final InterfaceC5115n0 f19399a = new C5074L();

    private C5103h0() {
    }

    /* JADX INFO: renamed from: a */
    public static C5103h0 m23146a() {
        return f19398c;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC5113m0 m23147b(Class cls, InterfaceC5113m0 interfaceC5113m0) {
        AbstractC5063B.m22838b(cls, "messageType");
        AbstractC5063B.m22838b(interfaceC5113m0, "schema");
        return (InterfaceC5113m0) this.f19400b.putIfAbsent(cls, interfaceC5113m0);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC5113m0 m23148c(Class cls) {
        InterfaceC5113m0 interfaceC5113m0M23147b;
        AbstractC5063B.m22838b(cls, "messageType");
        InterfaceC5113m0 interfaceC5113m0Mo22934a = (InterfaceC5113m0) this.f19400b.get(cls);
        return (interfaceC5113m0Mo22934a != null || (interfaceC5113m0M23147b = m23147b(cls, (interfaceC5113m0Mo22934a = this.f19399a.mo22934a(cls)))) == null) ? interfaceC5113m0Mo22934a : interfaceC5113m0M23147b;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC5113m0 m23149d(Object obj) {
        return m23148c(obj.getClass());
    }
}
