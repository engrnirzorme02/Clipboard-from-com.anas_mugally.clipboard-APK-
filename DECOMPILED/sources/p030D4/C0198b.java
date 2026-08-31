package p030D4;

import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.b */
/* JADX INFO: loaded from: classes.dex */
public class C0198b implements Comparable {

    /* JADX INFO: renamed from: b */
    private static final C0198b f873b = new C0198b("[MIN_NAME]");

    /* JADX INFO: renamed from: c */
    private static final C0198b f874c = new C0198b("[MAX_KEY]");

    /* JADX INFO: renamed from: d */
    private static final C0198b f875d = new C0198b(".priority");

    /* JADX INFO: renamed from: e */
    private static final C0198b f876e = new C0198b(".info");

    /* JADX INFO: renamed from: a */
    private final String f877a;

    /* JADX INFO: renamed from: D4.b$b */
    private static class b extends C0198b {

        /* JADX INFO: renamed from: f */
        private final int f878f;

        b(String str, int i7) {
            super(str);
            this.f878f = i7;
        }

        @Override // p030D4.C0198b, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((C0198b) obj);
        }

        @Override // p030D4.C0198b
        /* JADX INFO: renamed from: o */
        protected int mo994o() {
            return this.f878f;
        }

        @Override // p030D4.C0198b
        /* JADX INFO: renamed from: p */
        protected boolean mo995p() {
            return true;
        }

        @Override // p030D4.C0198b
        public String toString() {
            return "IntegerChildName(\"" + ((C0198b) this).f877a + "\")";
        }
    }

    /* JADX INFO: renamed from: j */
    public static C0198b m988j(String str) {
        Integer numM33238k = AbstractC7551l.m33238k(str);
        if (numM33238k != null) {
            return new b(str, numM33238k.intValue());
        }
        if (str.equals(".priority")) {
            return f875d;
        }
        AbstractC7551l.m33233f(!str.contains("/"));
        return new C0198b(str);
    }

    /* JADX INFO: renamed from: k */
    public static C0198b m989k() {
        return f874c;
    }

    /* JADX INFO: renamed from: m */
    public static C0198b m990m() {
        return f873b;
    }

    /* JADX INFO: renamed from: n */
    public static C0198b m991n() {
        return f875d;
    }

    /* JADX INFO: renamed from: d */
    public String m992d() {
        return this.f877a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0198b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f877a.equals(((C0198b) obj).f877a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0198b c0198b) {
        if (this == c0198b) {
            return 0;
        }
        if (this.f877a.equals("[MIN_NAME]") || c0198b.f877a.equals("[MAX_KEY]")) {
            return -1;
        }
        if (c0198b.f877a.equals("[MIN_NAME]") || this.f877a.equals("[MAX_KEY]")) {
            return 1;
        }
        if (!mo995p()) {
            if (c0198b.mo995p()) {
                return 1;
            }
            return this.f877a.compareTo(c0198b.f877a);
        }
        if (!c0198b.mo995p()) {
            return -1;
        }
        int iM33228a = AbstractC7551l.m33228a(mo994o(), c0198b.mo994o());
        return iM33228a == 0 ? AbstractC7551l.m33228a(this.f877a.length(), c0198b.f877a.length()) : iM33228a;
    }

    public int hashCode() {
        return this.f877a.hashCode();
    }

    /* JADX INFO: renamed from: o */
    protected int mo994o() {
        return 0;
    }

    /* JADX INFO: renamed from: p */
    protected boolean mo995p() {
        return false;
    }

    /* JADX INFO: renamed from: q */
    public boolean m996q() {
        return equals(f875d);
    }

    public String toString() {
        return "ChildKey(\"" + this.f877a + "\")";
    }

    private C0198b(String str) {
        this.f877a = str;
    }
}
