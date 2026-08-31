package p010B0;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC6118n;
import p018C0.C0123b;

/* JADX INFO: renamed from: B0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0047f {

    /* JADX INFO: renamed from: a */
    private final C0123b f381a;

    /* JADX INFO: renamed from: b */
    private C0043b.b f382b;

    /* JADX INFO: renamed from: B0.f$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo189a(InterfaceC0050i interfaceC0050i);
    }

    /* JADX INFO: renamed from: B0.f$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        Bundle mo174a();
    }

    public C0047f(C0123b impl) {
        AbstractC6118n.m27187e(impl, "impl");
        this.f381a = impl;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m185a(String key) {
        AbstractC6118n.m27187e(key, "key");
        return this.f381a.m579c(key);
    }

    /* JADX INFO: renamed from: b */
    public final b m186b(String key) {
        AbstractC6118n.m27187e(key, "key");
        return this.f381a.m580d(key);
    }

    /* JADX INFO: renamed from: c */
    public final void m187c(String key, b provider) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(provider, "provider");
        this.f381a.m585j(key, provider);
    }

    /* JADX INFO: renamed from: d */
    public final void m188d(Class clazz) {
        AbstractC6118n.m27187e(clazz, "clazz");
        if (!this.f381a.m581e()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0043b.b bVar = this.f382b;
        if (bVar == null) {
            bVar = new C0043b.b(this);
        }
        this.f382b = bVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            C0043b.b bVar2 = this.f382b;
            if (bVar2 != null) {
                String name = clazz.getName();
                AbstractC6118n.m27186d(name, "getName(...)");
                bVar2.m175b(name);
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
