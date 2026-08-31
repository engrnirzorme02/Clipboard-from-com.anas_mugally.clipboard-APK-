package p123P4;

/* JADX INFO: renamed from: P4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1229i {

    /* JADX INFO: renamed from: b */
    public static final C1229i f4330b = new C1229i(null);

    /* JADX INFO: renamed from: a */
    private final String f4331a;

    public C1229i(String str) {
        this.f4331a = str;
    }

    /* JADX INFO: renamed from: a */
    public String m5349a() {
        return this.f4331a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5350b() {
        return this.f4331a != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1229i.class == obj.getClass()) {
            String str = this.f4331a;
            String str2 = ((C1229i) obj).f4331a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4331a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "User(uid:" + this.f4331a + ")";
    }
}
