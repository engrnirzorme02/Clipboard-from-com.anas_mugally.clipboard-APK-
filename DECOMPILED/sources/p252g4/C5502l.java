package p252g4;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p228d4.C5235g;
import p300m4.C6346g;

/* JADX INFO: renamed from: g4.l */
/* JADX INFO: loaded from: classes.dex */
class C5502l {

    /* JADX INFO: renamed from: d */
    private static final FilenameFilter f20861d = new FilenameFilter() { // from class: g4.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("aqs.");
        }
    };

    /* JADX INFO: renamed from: e */
    private static final Comparator f20862e = new Comparator() { // from class: g4.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
        }
    };

    /* JADX INFO: renamed from: a */
    private final C6346g f20863a;

    /* JADX INFO: renamed from: b */
    private String f20864b = null;

    /* JADX INFO: renamed from: c */
    private String f20865c = null;

    C5502l(C6346g c6346g) {
        this.f20863a = c6346g;
    }

    /* JADX INFO: renamed from: d */
    private static void m24813d(C6346g c6346g, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c6346g.m27349q(str, "aqs." + str2).createNewFile();
        } catch (IOException e7) {
            C5235g.m24179f().m24189l("Failed to persist App Quality Sessions session id.", e7);
        }
    }

    /* JADX INFO: renamed from: e */
    static String m24814e(C6346g c6346g, String str) {
        List listM27350r = c6346g.m27350r(str, f20861d);
        if (!listM27350r.isEmpty()) {
            return ((File) Collections.min(listM27350r, f20862e)).getName().substring(4);
        }
        C5235g.m24179f().m24188k("Unable to read App Quality Sessions session id.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public synchronized String m24815c(String str) {
        if (Objects.equals(this.f20864b, str)) {
            return this.f20865c;
        }
        return m24814e(this.f20863a, str);
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m24816f(String str) {
        if (!Objects.equals(this.f20865c, str)) {
            m24813d(this.f20863a, this.f20864b, str);
            this.f20865c = str;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m24817g(String str) {
        if (!Objects.equals(this.f20864b, str)) {
            m24813d(this.f20863a, str, this.f20865c);
            this.f20864b = str;
        }
    }
}
