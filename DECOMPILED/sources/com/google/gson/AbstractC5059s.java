package com.google.gson;

import com.google.gson.internal.bind.C5037g;
import java.io.IOException;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5059s {

    /* JADX INFO: renamed from: com.google.gson.s$b */
    private final class b extends AbstractC5059s {
        private b() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: b */
        public Object mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() != EnumC7416b.NULL) {
                return AbstractC5059s.this.mo22636b(c7415a);
            }
            c7415a.m32821Z0();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: d */
        public void mo22637d(C7417c c7417c, Object obj) throws IOException {
            if (obj == null) {
                c7417c.mo22681R0();
            } else {
                AbstractC5059s.this.mo22637d(c7417c, obj);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + AbstractC5059s.this + "]";
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC5059s m22816a() {
        return !(this instanceof b) ? new b() : this;
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo22636b(C7415a c7415a);

    /* JADX INFO: renamed from: c */
    public final AbstractC5028g m22817c(Object obj) {
        try {
            C5037g c5037g = new C5037g();
            mo22637d(c5037g, obj);
            return c5037g.m22689i1();
        } catch (IOException e7) {
            throw new C5029h(e7);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo22637d(C7417c c7417c, Object obj);
}
