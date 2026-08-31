package p035E1;

import p019C1.EnumC0125a;
import p019C1.EnumC0127c;

/* JADX INFO: renamed from: E1.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0289j {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0289j f1155a = new a();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0289j f1156b = new b();

    /* JADX INFO: renamed from: c */
    public static final AbstractC0289j f1157c = new c();

    /* JADX INFO: renamed from: d */
    public static final AbstractC0289j f1158d = new d();

    /* JADX INFO: renamed from: e */
    public static final AbstractC0289j f1159e = new e();

    /* JADX INFO: renamed from: E1.j$a */
    class a extends AbstractC0289j {
        a() {
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: a */
        public boolean mo1391a() {
            return true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: b */
        public boolean mo1392b() {
            return true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: c */
        public boolean mo1393c(EnumC0125a enumC0125a) {
            return enumC0125a == EnumC0125a.REMOTE;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: d */
        public boolean mo1394d(boolean z7, EnumC0125a enumC0125a, EnumC0127c enumC0127c) {
            return (enumC0125a == EnumC0125a.RESOURCE_DISK_CACHE || enumC0125a == EnumC0125a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: E1.j$b */
    class b extends AbstractC0289j {
        b() {
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: a */
        public boolean mo1391a() {
            return false;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: b */
        public boolean mo1392b() {
            return false;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: c */
        public boolean mo1393c(EnumC0125a enumC0125a) {
            return false;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: d */
        public boolean mo1394d(boolean z7, EnumC0125a enumC0125a, EnumC0127c enumC0127c) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E1.j$c */
    class c extends AbstractC0289j {
        c() {
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: a */
        public boolean mo1391a() {
            return true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: b */
        public boolean mo1392b() {
            return false;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: c */
        public boolean mo1393c(EnumC0125a enumC0125a) {
            return (enumC0125a == EnumC0125a.DATA_DISK_CACHE || enumC0125a == EnumC0125a.MEMORY_CACHE) ? false : true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: d */
        public boolean mo1394d(boolean z7, EnumC0125a enumC0125a, EnumC0127c enumC0127c) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E1.j$d */
    class d extends AbstractC0289j {
        d() {
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: a */
        public boolean mo1391a() {
            return false;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: b */
        public boolean mo1392b() {
            return true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: c */
        public boolean mo1393c(EnumC0125a enumC0125a) {
            return false;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: d */
        public boolean mo1394d(boolean z7, EnumC0125a enumC0125a, EnumC0127c enumC0127c) {
            return (enumC0125a == EnumC0125a.RESOURCE_DISK_CACHE || enumC0125a == EnumC0125a.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: E1.j$e */
    class e extends AbstractC0289j {
        e() {
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: a */
        public boolean mo1391a() {
            return true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: b */
        public boolean mo1392b() {
            return true;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: c */
        public boolean mo1393c(EnumC0125a enumC0125a) {
            return enumC0125a == EnumC0125a.REMOTE;
        }

        @Override // p035E1.AbstractC0289j
        /* JADX INFO: renamed from: d */
        public boolean mo1394d(boolean z7, EnumC0125a enumC0125a, EnumC0127c enumC0127c) {
            return ((z7 && enumC0125a == EnumC0125a.DATA_DISK_CACHE) || enumC0125a == EnumC0125a.LOCAL) && enumC0127c == EnumC0127c.TRANSFORMED;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo1391a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo1392b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1393c(EnumC0125a enumC0125a);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo1394d(boolean z7, EnumC0125a enumC0125a, EnumC0127c enumC0127c);
}
