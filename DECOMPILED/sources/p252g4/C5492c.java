package p252g4;

/* JADX INFO: renamed from: g4.c */
/* JADX INFO: loaded from: classes.dex */
final class C5492c extends InterfaceC5471I.a {

    /* JADX INFO: renamed from: a */
    private final String f20833a;

    /* JADX INFO: renamed from: b */
    private final String f20834b;

    /* JADX INFO: renamed from: c */
    private final String f20835c;

    C5492c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f20833a = str;
        this.f20834b = str2;
        this.f20835c = str3;
    }

    @Override // p252g4.InterfaceC5471I.a
    /* JADX INFO: renamed from: c */
    public String mo24714c() {
        return this.f20833a;
    }

    @Override // p252g4.InterfaceC5471I.a
    /* JADX INFO: renamed from: d */
    public String mo24715d() {
        return this.f20835c;
    }

    @Override // p252g4.InterfaceC5471I.a
    /* JADX INFO: renamed from: e */
    public String mo24716e() {
        return this.f20834b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC5471I.a) {
            InterfaceC5471I.a aVar = (InterfaceC5471I.a) obj;
            if (this.f20833a.equals(aVar.mo24714c()) && ((str = this.f20834b) != null ? str.equals(aVar.mo24716e()) : aVar.mo24716e() == null) && ((str2 = this.f20835c) != null ? str2.equals(aVar.mo24715d()) : aVar.mo24715d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f20833a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20834b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20835c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f20833a + ", firebaseInstallationId=" + this.f20834b + ", firebaseAuthenticationToken=" + this.f20835c + "}";
    }
}
