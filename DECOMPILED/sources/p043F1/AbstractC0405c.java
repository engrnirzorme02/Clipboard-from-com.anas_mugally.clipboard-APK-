package p043F1;

import java.util.Queue;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: F1.c */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0405c {

    /* JADX INFO: renamed from: a */
    private final Queue f1620a = AbstractC2023l.m8415f(20);

    AbstractC0405c() {
    }

    /* JADX INFO: renamed from: a */
    abstract InterfaceC0414l mo1740a();

    /* JADX INFO: renamed from: b */
    InterfaceC0414l m1741b() {
        InterfaceC0414l interfaceC0414l = (InterfaceC0414l) this.f1620a.poll();
        return interfaceC0414l == null ? mo1740a() : interfaceC0414l;
    }

    /* JADX INFO: renamed from: c */
    public void m1742c(InterfaceC0414l interfaceC0414l) {
        if (this.f1620a.size() < 20) {
            this.f1620a.offer(interfaceC0414l);
        }
    }
}
