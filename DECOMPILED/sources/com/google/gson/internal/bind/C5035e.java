package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p359t5.InterfaceC7097b;
import p367u5.C7189t;

/* JADX INFO: renamed from: com.google.gson.internal.bind.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5035e implements InterfaceC5060t {

    /* JADX INFO: renamed from: c */
    private static final InterfaceC5060t f19102c;

    /* JADX INFO: renamed from: d */
    private static final InterfaceC5060t f19103d;

    /* JADX INFO: renamed from: a */
    private final C7189t f19104a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f19105b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.google.gson.internal.bind.e$b */
    private static class b implements InterfaceC5060t {
        private b() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f19102c = new b();
        f19103d = new b();
    }

    public C5035e(C7189t c7189t) {
        this.f19104a = c7189t;
    }

    /* JADX INFO: renamed from: b */
    private static Object m22668b(C7189t c7189t, Class cls) {
        return c7189t.m31710u(C5058a.m22809a(cls), true).mo31666a();
    }

    /* JADX INFO: renamed from: c */
    private static InterfaceC7097b m22669c(Class cls) {
        return (InterfaceC7097b) cls.getAnnotation(InterfaceC7097b.class);
    }

    /* JADX INFO: renamed from: f */
    private InterfaceC5060t m22670f(Class cls, InterfaceC5060t interfaceC5060t) {
        InterfaceC5060t interfaceC5060t2 = (InterfaceC5060t) this.f19105b.putIfAbsent(cls, interfaceC5060t);
        return interfaceC5060t2 != null ? interfaceC5060t2 : interfaceC5060t;
    }

    @Override // com.google.gson.InterfaceC5060t
    /* JADX INFO: renamed from: a */
    public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
        InterfaceC7097b interfaceC7097bM22669c = m22669c(c5058a.m22814c());
        if (interfaceC7097bM22669c == null) {
            return null;
        }
        return m22671d(this.f19104a, c5026e, c5058a, interfaceC7097bM22669c, true);
    }

    /* JADX INFO: renamed from: d */
    AbstractC5059s m22671d(C7189t c7189t, C5026e c5026e, C5058a c5058a, InterfaceC7097b interfaceC7097b, boolean z7) {
        AbstractC5059s abstractC5059sMo22659a;
        Object objM22668b = m22668b(c7189t, interfaceC7097b.value());
        boolean zNullSafe = interfaceC7097b.nullSafe();
        if (objM22668b instanceof AbstractC5059s) {
            abstractC5059sMo22659a = (AbstractC5059s) objM22668b;
        } else {
            if (!(objM22668b instanceof InterfaceC5060t)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objM22668b.getClass().getName() + " as a @JsonAdapter for " + c5058a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC5060t interfaceC5060tM22670f = (InterfaceC5060t) objM22668b;
            if (z7) {
                interfaceC5060tM22670f = m22670f(c5058a.m22814c(), interfaceC5060tM22670f);
            }
            abstractC5059sMo22659a = interfaceC5060tM22670f.mo22659a(c5026e, c5058a);
        }
        return (abstractC5059sMo22659a == null || !zNullSafe) ? abstractC5059sMo22659a : abstractC5059sMo22659a.m22816a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m22672e(C5058a c5058a, InterfaceC5060t interfaceC5060t) {
        Objects.requireNonNull(c5058a);
        Objects.requireNonNull(interfaceC5060t);
        if (interfaceC5060t == f19102c) {
            return true;
        }
        Class clsM22814c = c5058a.m22814c();
        InterfaceC5060t interfaceC5060t2 = (InterfaceC5060t) this.f19105b.get(clsM22814c);
        if (interfaceC5060t2 != null) {
            return interfaceC5060t2 == interfaceC5060t;
        }
        InterfaceC7097b interfaceC7097bM22669c = m22669c(clsM22814c);
        if (interfaceC7097bM22669c == null) {
            return false;
        }
        Class clsValue = interfaceC7097bM22669c.value();
        return InterfaceC5060t.class.isAssignableFrom(clsValue) && m22670f(clsM22814c, (InterfaceC5060t) m22668b(this.f19104a, clsValue)) == interfaceC5060t;
    }
}
