package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p367u5.AbstractC7191v;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5031a extends AbstractC5059s {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5060t f19087c = new a();

    /* JADX INFO: renamed from: a */
    private final Class f19088a;

    /* JADX INFO: renamed from: b */
    private final AbstractC5059s f19089b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            Type typeM22815d = c5058a.m22815d();
            if (!(typeM22815d instanceof GenericArrayType) && (!(typeM22815d instanceof Class) || !((Class) typeM22815d).isArray())) {
                return null;
            }
            Type typeM31725g = AbstractC7191v.m31725g(typeM22815d);
            return new C5031a(c5026e, c5026e.m22624l(C5058a.m22810b(typeM31725g)), AbstractC7191v.m31729k(typeM31725g));
        }
    }

    public C5031a(C5026e c5026e, AbstractC5059s abstractC5059s, Class cls) {
        this.f19089b = new C5043m(c5026e, abstractC5059s, cls);
        this.f19088a = cls;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: b */
    public Object mo22636b(C7415a c7415a) throws IOException {
        if (c7415a.m32824d1() == EnumC7416b.NULL) {
            c7415a.m32821Z0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c7415a.m32827m();
        while (c7415a.m32812K0()) {
            arrayList.add(this.f19089b.mo22636b(c7415a));
        }
        c7415a.m32823d0();
        int size = arrayList.size();
        if (!this.f19088a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f19088a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f19088a, size);
        for (int i7 = 0; i7 < size; i7++) {
            Array.set(objNewInstance, i7, arrayList.get(i7));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: d */
    public void mo22637d(C7417c c7417c, Object obj) throws IOException {
        if (obj == null) {
            c7417c.mo22681R0();
            return;
        }
        c7417c.mo22691x();
        int length = Array.getLength(obj);
        for (int i7 = 0; i7 < length; i7++) {
            this.f19089b.mo22637d(c7417c, Array.get(obj, i7));
        }
        c7417c.mo22684d0();
    }
}
