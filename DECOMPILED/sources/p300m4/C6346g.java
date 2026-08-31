package p300m4;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p228d4.C5235g;
import p228d4.C5238j;
import p252g4.AbstractC5499i;

/* JADX INFO: renamed from: m4.g */
/* JADX INFO: loaded from: classes.dex */
public class C6346g {

    /* JADX INFO: renamed from: a */
    final String f24194a;

    /* JADX INFO: renamed from: b */
    private final File f24195b;

    /* JADX INFO: renamed from: c */
    private final File f24196c;

    /* JADX INFO: renamed from: d */
    private final File f24197d;

    /* JADX INFO: renamed from: e */
    private final File f24198e;

    /* JADX INFO: renamed from: f */
    private final File f24199f;

    /* JADX INFO: renamed from: g */
    private final File f24200g;

    public C6346g(Context context) {
        String str;
        String strMo26543d = C5238j.f19969a.m24196e(context).mo26543d();
        this.f24194a = strMo26543d;
        File filesDir = context.getFilesDir();
        this.f24195b = filesDir;
        if (m27336x()) {
            str = ".crashlytics.v3" + File.separator + m27335w(strMo26543d);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileM27331s = m27331s(new File(filesDir, str));
        this.f24196c = fileM27331s;
        this.f24197d = m27331s(new File(fileM27331s, "open-sessions"));
        this.f24198e = m27331s(new File(fileM27331s, "reports"));
        this.f24199f = m27331s(new File(fileM27331s, "priority-reports"));
        this.f24200g = m27331s(new File(fileM27331s, "native-reports"));
    }

    /* JADX INFO: renamed from: b */
    private void m27328b(String str) {
        File file = new File(this.f24195b, str);
        if (file.exists() && m27333u(file)) {
            C5235g.m24179f().m24180b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* JADX INFO: renamed from: c */
    private void m27329c(final String str) {
        String[] list;
        if (!this.f24195b.exists() || (list = this.f24195b.list(new FilenameFilter() { // from class: m4.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            m27328b(str2);
        }
    }

    /* JADX INFO: renamed from: p */
    private File m27330p(String str) {
        return m27332t(new File(this.f24197d, str));
    }

    /* JADX INFO: renamed from: s */
    private static synchronized File m27331s(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                C5235g.m24179f().m24180b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                C5235g.m24179f().m24182d("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    private static File m27332t(File file) {
        file.mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: u */
    static boolean m27333u(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m27333u(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: v */
    private static List m27334v(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX INFO: renamed from: w */
    static String m27335w(String str) {
        return str.length() > 40 ? AbstractC5499i.m24781A(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    /* JADX INFO: renamed from: x */
    private boolean m27336x() {
        return !this.f24194a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public void m27337d() {
        m27328b(".com.google.firebase.crashlytics");
        m27328b(".com.google.firebase.crashlytics-ndk");
        if (m27336x()) {
            m27328b(".com.google.firebase.crashlytics.files.v1");
            m27329c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m27338e(String str) {
        return m27333u(new File(this.f24197d, str));
    }

    /* JADX INFO: renamed from: f */
    public List m27339f() {
        return m27334v(this.f24197d.list());
    }

    /* JADX INFO: renamed from: g */
    public File m27340g(String str) {
        return new File(this.f24196c, str);
    }

    /* JADX INFO: renamed from: h */
    public List m27341h(FilenameFilter filenameFilter) {
        return m27334v(this.f24196c.listFiles(filenameFilter));
    }

    /* JADX INFO: renamed from: i */
    public File m27342i(String str) {
        return new File(this.f24200g, str);
    }

    /* JADX INFO: renamed from: j */
    public List m27343j() {
        return m27334v(this.f24200g.listFiles());
    }

    /* JADX INFO: renamed from: k */
    public File m27344k(String str) {
        return m27332t(new File(m27330p(str), "native"));
    }

    /* JADX INFO: renamed from: l */
    public File m27345l(String str) {
        return new File(this.f24199f, str);
    }

    /* JADX INFO: renamed from: m */
    public List m27346m() {
        return m27334v(this.f24199f.listFiles());
    }

    /* JADX INFO: renamed from: n */
    public File m27347n(String str) {
        return new File(this.f24198e, str);
    }

    /* JADX INFO: renamed from: o */
    public List m27348o() {
        return m27334v(this.f24198e.listFiles());
    }

    /* JADX INFO: renamed from: q */
    public File m27349q(String str, String str2) {
        return new File(m27330p(str), str2);
    }

    /* JADX INFO: renamed from: r */
    public List m27350r(String str, FilenameFilter filenameFilter) {
        return m27334v(m27330p(str).listFiles(filenameFilter));
    }
}
