package p367u5;

import androidx.appcompat.app.AbstractC2263x;
import com.google.gson.AbstractC5059s;
import com.google.gson.C5022a;
import com.google.gson.C5026e;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p359t5.InterfaceC7096a;
import p359t5.InterfaceC7099d;
import p359t5.InterfaceC7100e;
import p383w5.AbstractC7359a;
import p391x5.C7415a;
import p391x5.C7417c;

/* JADX INFO: renamed from: u5.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7190u implements InterfaceC5060t, Cloneable {

    /* JADX INFO: renamed from: r */
    public static final C7190u f28657r = new C7190u();

    /* JADX INFO: renamed from: a */
    private double f28658a = -1.0d;

    /* JADX INFO: renamed from: b */
    private int f28659b = 136;

    /* JADX INFO: renamed from: c */
    private boolean f28660c = true;

    /* JADX INFO: renamed from: d */
    private boolean f28661d;

    /* JADX INFO: renamed from: e */
    private List f28662e;

    /* JADX INFO: renamed from: f */
    private List f28663f;

    /* JADX INFO: renamed from: u5.u$a */
    class a extends AbstractC5059s {

        /* JADX INFO: renamed from: a */
        private volatile AbstractC5059s f28664a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f28665b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f28666c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C5026e f28667d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C5058a f28668e;

        a(boolean z7, boolean z8, C5026e c5026e, C5058a c5058a) {
            this.f28665b = z7;
            this.f28666c = z8;
            this.f28667d = c5026e;
            this.f28668e = c5058a;
        }

        /* JADX INFO: renamed from: e */
        private AbstractC5059s m31718e() {
            AbstractC5059s abstractC5059s = this.f28664a;
            if (abstractC5059s != null) {
                return abstractC5059s;
            }
            AbstractC5059s abstractC5059sM22626n = this.f28667d.m22626n(C7190u.this, this.f28668e);
            this.f28664a = abstractC5059sM22626n;
            return abstractC5059sM22626n;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: b */
        public Object mo22636b(C7415a c7415a) throws IOException {
            if (!this.f28665b) {
                return m31718e().mo22636b(c7415a);
            }
            c7415a.m32829n1();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: d */
        public void mo22637d(C7417c c7417c, Object obj) throws IOException {
            if (this.f28666c) {
                c7417c.mo22681R0();
            } else {
                m31718e().mo22637d(c7417c, obj);
            }
        }
    }

    public C7190u() {
        List list = Collections.EMPTY_LIST;
        this.f28662e = list;
        this.f28663f = list;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m31711e(Class cls) {
        return cls.isMemberClass() && !AbstractC7359a.m32407n(cls);
    }

    /* JADX INFO: renamed from: f */
    private boolean m31712f(InterfaceC7099d interfaceC7099d) {
        if (interfaceC7099d != null) {
            return this.f28658a >= interfaceC7099d.value();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m31713g(InterfaceC7100e interfaceC7100e) {
        if (interfaceC7100e != null) {
            return this.f28658a < interfaceC7100e.value();
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private boolean m31714h(InterfaceC7099d interfaceC7099d, InterfaceC7100e interfaceC7100e) {
        return m31712f(interfaceC7099d) && m31713g(interfaceC7100e);
    }

    @Override // com.google.gson.InterfaceC5060t
    /* JADX INFO: renamed from: a */
    public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
        Class clsM22814c = c5058a.m22814c();
        boolean zM31716c = m31716c(clsM22814c, true);
        boolean zM31716c2 = m31716c(clsM22814c, false);
        if (zM31716c || zM31716c2) {
            return new a(zM31716c2, zM31716c, c5026e, c5058a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7190u clone() {
        try {
            return (C7190u) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m31716c(Class cls, boolean z7) {
        if (this.f28658a != -1.0d && !m31714h((InterfaceC7099d) cls.getAnnotation(InterfaceC7099d.class), (InterfaceC7100e) cls.getAnnotation(InterfaceC7100e.class))) {
            return true;
        }
        if (!this.f28660c && m31711e(cls)) {
            return true;
        }
        if (!z7 && !Enum.class.isAssignableFrom(cls) && AbstractC7359a.m32405l(cls)) {
            return true;
        }
        Iterator it = (z7 ? this.f28662e : this.f28663f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC2263x.m9328a(it.next());
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m31717d(Field field, boolean z7) {
        InterfaceC7096a interfaceC7096a;
        if ((this.f28659b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f28658a != -1.0d && !m31714h((InterfaceC7099d) field.getAnnotation(InterfaceC7099d.class), (InterfaceC7100e) field.getAnnotation(InterfaceC7100e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f28661d && ((interfaceC7096a = (InterfaceC7096a) field.getAnnotation(InterfaceC7096a.class)) == null || (!z7 ? interfaceC7096a.deserialize() : interfaceC7096a.serialize()))) || m31716c(field.getType(), z7)) {
            return true;
        }
        List list = z7 ? this.f28662e : this.f28663f;
        if (list.isEmpty()) {
            return false;
        }
        new C5022a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC2263x.m9328a(it.next());
        throw null;
    }
}
