package com.anas_mugally.clipboard.database;

import android.content.Context;
import android.database.Cursor;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0176g;
import p197a1.C2184c;
import p215c1.InterfaceC2979a;
import p215c1.InterfaceC2981c;
import p215c1.InterfaceC2983e;
import p394y0.AbstractC7462q;
import p394y0.C7461p;
import p402z0.AbstractC7558a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends AbstractC7462q {

    /* JADX INFO: renamed from: q */
    private static AppDatabase f12598q;

    /* JADX INFO: renamed from: p */
    public static final C3053a f12597p = new C3053a(null);

    /* JADX INFO: renamed from: r */
    private static final String f12599r = "app_database";

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.database.AppDatabase$a */
    public static final class C3053a {

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.database.AppDatabase$a$a */
        public static final class a extends AbstractC7558a {
            a() {
                super(2, 3);
            }

            @Override // p402z0.AbstractC7558a
            /* JADX INFO: renamed from: a */
            public void mo14541a(InterfaceC0176g database) {
                AbstractC6118n.m27187e(database, "database");
                database.mo888s("ALTER TABLE category_table ADD COLUMN name TEXT");
                database.mo888s("ALTER TABLE text_table ADD COLUMN orderPin INTEGER NOT NULL DEFAULT 0");
                Cursor cursorMo881a0 = database.mo881a0("SELECT " + C2184c.f7064b.m8903a() + " FROM category_table");
                while (cursorMo881a0.moveToNext()) {
                    C2184c.b bVar = C2184c.f7064b;
                    String string = cursorMo881a0.getString(cursorMo881a0.getColumnIndex(bVar.m8903a()));
                    database.mo879S("UPDATE category_table SET name='" + string + "' WHERE " + bVar.m8903a() + " =?", new String[]{string});
                }
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.database.AppDatabase$a$b */
        public static final class b extends AbstractC7558a {
            b() {
                super(3, 4);
            }

            @Override // p402z0.AbstractC7558a
            /* JADX INFO: renamed from: a */
            public void mo14541a(InterfaceC0176g database) {
                AbstractC6118n.m27187e(database, "database");
                database.mo888s("ALTER TABLE category_table ADD COLUMN allowBiometric INTEGER NOT NULL DEFAULT 0");
            }
        }

        /* JADX INFO: renamed from: com.anas_mugally.clipboard.database.AppDatabase$a$c */
        public static final class c extends AbstractC7558a {
            c() {
                super(4, 5);
            }

            @Override // p402z0.AbstractC7558a
            /* JADX INFO: renamed from: a */
            public void mo14541a(InterfaceC0176g database) {
                AbstractC6118n.m27187e(database, "database");
                database.mo888s("CREATE TABLE IF NOT EXISTS `temporary_text_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL)");
            }
        }

        public /* synthetic */ C3053a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m15147a() {
            return AppDatabase.f12599r;
        }

        /* JADX INFO: renamed from: b */
        public final synchronized AppDatabase m15148b(Context context) {
            AppDatabase appDatabase;
            try {
                AbstractC6118n.m27187e(context, "context");
                a aVar = new a();
                b bVar = new b();
                c cVar = new c();
                if (AppDatabase.f12598q == null) {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC6118n.m27186d(applicationContext, "getApplicationContext(...)");
                    AppDatabase.f12598q = (AppDatabase) C7461p.m33018a(applicationContext, AppDatabase.class, m15147a()).m33044b(aVar, bVar, cVar).m33046d();
                }
                appDatabase = AppDatabase.f12598q;
                AbstractC6118n.m27184b(appDatabase);
            } catch (Throwable th) {
                throw th;
            }
            return appDatabase;
        }

        private C3053a() {
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract InterfaceC2979a mo15144E();

    /* JADX INFO: renamed from: F */
    public abstract InterfaceC2981c mo15145F();

    /* JADX INFO: renamed from: G */
    public abstract InterfaceC2983e mo15146G();
}
