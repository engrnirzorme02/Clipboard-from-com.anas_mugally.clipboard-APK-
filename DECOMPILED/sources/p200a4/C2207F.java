package p200a4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p116O4.InterfaceC1147c;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.F */
/* JADX INFO: loaded from: classes.dex */
final class C2207F implements InterfaceC2211d {

    /* JADX INFO: renamed from: a */
    private final Set f7141a;

    /* JADX INFO: renamed from: b */
    private final Set f7142b;

    /* JADX INFO: renamed from: c */
    private final Set f7143c;

    /* JADX INFO: renamed from: d */
    private final Set f7144d;

    /* JADX INFO: renamed from: e */
    private final Set f7145e;

    /* JADX INFO: renamed from: f */
    private final Set f7146f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC2211d f7147g;

    /* JADX INFO: renamed from: a4.F$a */
    private static class a implements InterfaceC1147c {

        /* JADX INFO: renamed from: a */
        private final Set f7148a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC1147c f7149b;

        public a(Set set, InterfaceC1147c interfaceC1147c) {
            this.f7148a = set;
            this.f7149b = interfaceC1147c;
        }
    }

    C2207F(C2210c c2210c, InterfaceC2211d interfaceC2211d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C2224q c2224q : c2210c.m8970g()) {
            if (c2224q.m9039e()) {
                if (c2224q.m9041g()) {
                    hashSet4.add(c2224q.m9037c());
                } else {
                    hashSet.add(c2224q.m9037c());
                }
            } else if (c2224q.m9038d()) {
                hashSet3.add(c2224q.m9037c());
            } else if (c2224q.m9041g()) {
                hashSet5.add(c2224q.m9037c());
            } else {
                hashSet2.add(c2224q.m9037c());
            }
        }
        if (!c2210c.m8974k().isEmpty()) {
            hashSet.add(C2206E.m8952b(InterfaceC1147c.class));
        }
        this.f7141a = Collections.unmodifiableSet(hashSet);
        this.f7142b = Collections.unmodifiableSet(hashSet2);
        this.f7143c = Collections.unmodifiableSet(hashSet3);
        this.f7144d = Collections.unmodifiableSet(hashSet4);
        this.f7145e = Collections.unmodifiableSet(hashSet5);
        this.f7146f = c2210c.m8974k();
        this.f7147g = interfaceC2211d;
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: a */
    public Object mo8953a(Class cls) {
        if (!this.f7141a.contains(C2206E.m8952b(cls))) {
            throw new C2226s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objMo8953a = this.f7147g.mo8953a(cls);
        return !cls.equals(InterfaceC1147c.class) ? objMo8953a : new a(this.f7146f, (InterfaceC1147c) objMo8953a);
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: b */
    public Object mo8954b(C2206E c2206e) {
        if (this.f7141a.contains(c2206e)) {
            return this.f7147g.mo8954b(c2206e);
        }
        throw new C2226s(String.format("Attempting to request an undeclared dependency %s.", c2206e));
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: c */
    public InterfaceC2972b mo8955c(Class cls) {
        return mo8957f(C2206E.m8952b(cls));
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: d */
    public InterfaceC2971a mo8956d(C2206E c2206e) {
        if (this.f7143c.contains(c2206e)) {
            return this.f7147g.mo8956d(c2206e);
        }
        throw new C2226s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c2206e));
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: f */
    public InterfaceC2972b mo8957f(C2206E c2206e) {
        if (this.f7142b.contains(c2206e)) {
            return this.f7147g.mo8957f(c2206e);
        }
        throw new C2226s(String.format("Attempting to request an undeclared dependency Provider<%s>.", c2206e));
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: g */
    public InterfaceC2972b mo8958g(C2206E c2206e) {
        if (this.f7145e.contains(c2206e)) {
            return this.f7147g.mo8958g(c2206e);
        }
        throw new C2226s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c2206e));
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: h */
    public Set mo8959h(C2206E c2206e) {
        if (this.f7144d.contains(c2206e)) {
            return this.f7147g.mo8959h(c2206e);
        }
        throw new C2226s(String.format("Attempting to request an undeclared dependency Set<%s>.", c2206e));
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: i */
    public InterfaceC2971a mo8960i(Class cls) {
        return mo8956d(C2206E.m8952b(cls));
    }
}
