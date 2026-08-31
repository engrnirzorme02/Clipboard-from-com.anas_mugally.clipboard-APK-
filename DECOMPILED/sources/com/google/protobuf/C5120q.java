package com.google.protobuf;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public class C5120q {

    /* JADX INFO: renamed from: b */
    private static boolean f19523b = true;

    /* JADX INFO: renamed from: c */
    private static volatile C5120q f19524c;

    /* JADX INFO: renamed from: d */
    static final C5120q f19525d = new C5120q(true);

    /* JADX INFO: renamed from: a */
    private final Map f19526a = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: com.google.protobuf.q$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final Object f19527a;

        /* JADX INFO: renamed from: b */
        private final int f19528b;

        a(Object obj, int i7) {
            this.f19527a = obj;
            this.f19528b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19527a == aVar.f19527a && this.f19528b == aVar.f19528b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19527a) * 65535) + this.f19528b;
        }
    }

    C5120q(boolean z7) {
    }

    /* JADX INFO: renamed from: b */
    public static C5120q m23562b() {
        C5120q c5120qM23530a;
        if (!f19523b) {
            return f19525d;
        }
        C5120q c5120q = f19524c;
        if (c5120q != null) {
            return c5120q;
        }
        synchronized (C5120q.class) {
            try {
                c5120qM23530a = f19524c;
                if (c5120qM23530a == null) {
                    c5120qM23530a = AbstractC5118p.m23530a();
                    f19524c = c5120qM23530a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5120qM23530a;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC5136y.c m23563a(InterfaceC5082U interfaceC5082U, int i7) {
        AbstractC2263x.m9328a(this.f19526a.get(new a(interfaceC5082U, i7)));
        return null;
    }
}
