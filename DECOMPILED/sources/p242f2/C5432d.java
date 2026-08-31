package p242f2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: f2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5432d {

    /* JADX INFO: renamed from: c */
    private static final C5432d f20686c = new a().m24627a();

    /* JADX INFO: renamed from: a */
    private final String f20687a;

    /* JADX INFO: renamed from: b */
    private final List f20688b;

    /* JADX INFO: renamed from: f2.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private String f20689a = "";

        /* JADX INFO: renamed from: b */
        private List f20690b = new ArrayList();

        a() {
        }

        /* JADX INFO: renamed from: a */
        public C5432d m24627a() {
            return new C5432d(this.f20689a, Collections.unmodifiableList(this.f20690b));
        }

        /* JADX INFO: renamed from: b */
        public a m24628b(List list) {
            this.f20690b = list;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m24629c(String str) {
            this.f20689a = str;
            return this;
        }
    }

    C5432d(String str, List list) {
        this.f20687a = str;
        this.f20688b = list;
    }

    /* JADX INFO: renamed from: c */
    public static a m24624c() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    public List m24625a() {
        return this.f20688b;
    }

    /* JADX INFO: renamed from: b */
    public String m24626b() {
        return this.f20687a;
    }
}
