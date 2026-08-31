package com.google.gson;

import java.io.IOException;
import p367u5.AbstractC7167F;
import p391x5.C7417c;

/* JADX INFO: renamed from: com.google.gson.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5028g {
    /* JADX INFO: renamed from: a */
    public C5027f m22652a() {
        if (m22655g()) {
            return (C5027f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* JADX INFO: renamed from: b */
    public C5049j m22653b() {
        if (m22657k()) {
            return (C5049j) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* JADX INFO: renamed from: e */
    public C5051l m22654e() {
        if (m22658m()) {
            return (C5051l) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* JADX INFO: renamed from: g */
    public boolean m22655g() {
        return this instanceof C5027f;
    }

    /* JADX INFO: renamed from: j */
    public boolean m22656j() {
        return this instanceof C5030i;
    }

    /* JADX INFO: renamed from: k */
    public boolean m22657k() {
        return this instanceof C5049j;
    }

    /* JADX INFO: renamed from: m */
    public boolean m22658m() {
        return this instanceof C5051l;
    }

    public String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            C7417c c7417c = new C7417c(AbstractC7167F.m31676b(sb));
            c7417c.m32848Z0(EnumC5055p.LENIENT);
            AbstractC7167F.m31675a(this, c7417c);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
