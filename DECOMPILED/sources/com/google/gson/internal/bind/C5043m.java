package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.reflect.C5058a;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p391x5.C7415a;
import p391x5.C7417c;

/* JADX INFO: renamed from: com.google.gson.internal.bind.m */
/* JADX INFO: loaded from: classes.dex */
final class C5043m extends AbstractC5059s {

    /* JADX INFO: renamed from: a */
    private final C5026e f19153a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5059s f19154b;

    /* JADX INFO: renamed from: c */
    private final Type f19155c;

    C5043m(C5026e c5026e, AbstractC5059s abstractC5059s, Type type) {
        this.f19153a = c5026e;
        this.f19154b = abstractC5059s;
        this.f19155c = type;
    }

    /* JADX INFO: renamed from: e */
    private static Type m22721e(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    /* JADX INFO: renamed from: f */
    private static boolean m22722f(AbstractC5059s abstractC5059s) {
        AbstractC5059s abstractC5059sMo22649e;
        while ((abstractC5059s instanceof AbstractC5042l) && (abstractC5059sMo22649e = ((AbstractC5042l) abstractC5059s).mo22649e()) != abstractC5059s) {
            abstractC5059s = abstractC5059sMo22649e;
        }
        return abstractC5059s instanceof C5041k.c;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: b */
    public Object mo22636b(C7415a c7415a) {
        return this.f19154b.mo22636b(c7415a);
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: d */
    public void mo22637d(C7417c c7417c, Object obj) {
        AbstractC5059s abstractC5059sM22624l = this.f19154b;
        Type typeM22721e = m22721e(this.f19155c, obj);
        if (typeM22721e != this.f19155c) {
            abstractC5059sM22624l = this.f19153a.m22624l(C5058a.m22810b(typeM22721e));
            if ((abstractC5059sM22624l instanceof C5041k.c) && !m22722f(this.f19154b)) {
                abstractC5059sM22624l = this.f19154b;
            }
        }
        abstractC5059sM22624l.mo22637d(c7417c, obj);
    }
}
