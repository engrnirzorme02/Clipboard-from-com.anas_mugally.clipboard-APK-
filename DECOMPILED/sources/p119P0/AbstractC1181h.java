package p119P0;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p112O0.AbstractC1097j;

/* JADX INFO: renamed from: P0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1181h {

    /* JADX INFO: renamed from: a */
    private static final String f4169a = AbstractC1097j.m4846f("WrkDbPathHelper");

    /* JADX INFO: renamed from: b */
    private static final String[] f4170b = {"-journal", "-shm", "-wal"};

    /* JADX INFO: renamed from: a */
    public static File m5156a(Context context) {
        return m5158c(context, "androidx.work.workdb");
    }

    /* JADX INFO: renamed from: b */
    public static File m5157b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* JADX INFO: renamed from: c */
    private static File m5158c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* JADX INFO: renamed from: d */
    public static String m5159d() {
        return "androidx.work.workdb";
    }

    /* JADX INFO: renamed from: e */
    public static void m5160e(Context context) {
        if (m5157b(context).exists()) {
            AbstractC1097j.m4844c().mo4847a(f4169a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map mapM5161f = m5161f(context);
            for (File file : mapM5161f.keySet()) {
                File file2 = (File) mapM5161f.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        AbstractC1097j.m4844c().mo4851h(f4169a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    AbstractC1097j.m4844c().mo4847a(f4169a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Map m5161f(Context context) {
        HashMap map = new HashMap();
        File fileM5157b = m5157b(context);
        File fileM5156a = m5156a(context);
        map.put(fileM5157b, fileM5156a);
        for (String str : f4170b) {
            map.put(new File(fileM5157b.getPath() + str), new File(fileM5156a.getPath() + str));
        }
        return map;
    }
}
