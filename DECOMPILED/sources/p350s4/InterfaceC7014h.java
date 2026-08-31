package p350s4;

import java.util.Comparator;

/* JADX INFO: renamed from: s4.h */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7014h {

    /* JADX INFO: renamed from: s4.h$a */
    public enum a {
        RED,
        BLACK
    }

    /* JADX INFO: renamed from: s4.h$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract void mo1017a(Object obj, Object obj2);
    }

    /* JADX INFO: renamed from: a */
    InterfaceC7014h mo30629a();

    /* JADX INFO: renamed from: b */
    InterfaceC7014h mo30630b(Object obj, Object obj2, Comparator comparator);

    /* JADX INFO: renamed from: c */
    InterfaceC7014h mo30631c(Object obj, Object obj2, a aVar, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2);

    /* JADX INFO: renamed from: d */
    InterfaceC7014h mo30632d(Object obj, Comparator comparator);

    /* JADX INFO: renamed from: e */
    void mo30633e(b bVar);

    /* JADX INFO: renamed from: f */
    boolean mo30624f();

    /* JADX INFO: renamed from: g */
    InterfaceC7014h mo30634g();

    Object getKey();

    Object getValue();

    /* JADX INFO: renamed from: h */
    InterfaceC7014h mo30635h();

    /* JADX INFO: renamed from: i */
    InterfaceC7014h mo30636i();

    boolean isEmpty();

    int size();
}
