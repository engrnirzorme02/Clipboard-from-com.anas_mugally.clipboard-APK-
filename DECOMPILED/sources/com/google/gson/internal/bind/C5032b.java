package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p367u5.AbstractC7191v;
import p367u5.C7189t;
import p367u5.InterfaceC7163B;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5032b implements InterfaceC5060t {

    /* JADX INFO: renamed from: a */
    private final C7189t f19090a;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.b$a */
    private static final class a extends AbstractC5059s {

        /* JADX INFO: renamed from: a */
        private final AbstractC5059s f19091a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC7163B f19092b;

        a(AbstractC5059s abstractC5059s, InterfaceC7163B interfaceC7163B) {
            this.f19091a = abstractC5059s;
            this.f19092b = interfaceC7163B;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            Collection collection = (Collection) this.f19092b.mo31666a();
            c7415a.m32827m();
            while (c7415a.m32812K0()) {
                collection.add(this.f19091a.mo22636b(c7415a));
            }
            c7415a.m32823d0();
            return collection;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo22637d(C7417c c7417c, Collection collection) throws IOException {
            if (collection == null) {
                c7417c.mo22681R0();
                return;
            }
            c7417c.mo22691x();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f19091a.mo22637d(c7417c, it.next());
            }
            c7417c.mo22684d0();
        }
    }

    public C5032b(C7189t c7189t) {
        this.f19090a = c7189t;
    }

    @Override // com.google.gson.InterfaceC5060t
    /* JADX INFO: renamed from: a */
    public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
        Type typeM22815d = c5058a.m22815d();
        Class clsM22814c = c5058a.m22814c();
        if (!Collection.class.isAssignableFrom(clsM22814c)) {
            return null;
        }
        Type typeM31726h = AbstractC7191v.m31726h(typeM22815d, clsM22814c);
        return new a(new C5043m(c5026e, c5026e.m22624l(C5058a.m22810b(typeM31726h)), typeM31726h), this.f19090a.m31710u(c5058a, false));
    }
}
