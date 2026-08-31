package com.anas_mugally.clipboard.database;

import androidx.room.C2805c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002A0.AbstractC0004b;
import p002A0.C0007e;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p215c1.C2980b;
import p215c1.C2982d;
import p215c1.C2984f;
import p215c1.InterfaceC2979a;
import p215c1.InterfaceC2981c;
import p215c1.InterfaceC2983e;
import p394y0.AbstractC7462q;
import p394y0.C7451f;
import p394y0.C7464s;

/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: s */
    private volatile InterfaceC2983e f12600s;

    /* JADX INFO: renamed from: t */
    private volatile InterfaceC2979a f12601t;

    /* JADX INFO: renamed from: u */
    private volatile InterfaceC2981c f12602u;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.database.AppDatabase_Impl$a */
    class C3054a extends C7464s.b {
        C3054a(int i7) {
            super(i7);
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: a */
        public void mo14534a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `text_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `textTitle` TEXT, `textContent` TEXT NOT NULL, `category` TEXT NOT NULL, `orderPin` INTEGER NOT NULL, `isUploaded` INTEGER NOT NULL, FOREIGN KEY(`category`) REFERENCES `category_table`(`categoryName`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `category_table` (`categoryName` TEXT NOT NULL, `order` INTEGER NOT NULL, `isLocked` INTEGER NOT NULL, `pass` TEXT NOT NULL, `allowBiometric` INTEGER NOT NULL, `name` TEXT, PRIMARY KEY(`categoryName`))");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `temporary_text_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL)");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC0176g.mo888s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'acf5c44ce1544d4d9382645eedf9ef3e')");
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: b */
        public void mo14535b(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `text_table`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `category_table`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `temporary_text_table`");
            List list = ((AbstractC7462q) AppDatabase_Impl.this).f29927h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC7462q.b) it.next()).m33051b(interfaceC0176g);
                }
            }
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: c */
        public void mo14536c(InterfaceC0176g interfaceC0176g) {
            List list = ((AbstractC7462q) AppDatabase_Impl.this).f29927h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC7462q.b) it.next()).m33050a(interfaceC0176g);
                }
            }
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: d */
        public void mo14537d(InterfaceC0176g interfaceC0176g) {
            ((AbstractC7462q) AppDatabase_Impl.this).f29920a = interfaceC0176g;
            interfaceC0176g.mo888s("PRAGMA foreign_keys = ON");
            AppDatabase_Impl.this.m33038u(interfaceC0176g);
            List list = ((AbstractC7462q) AppDatabase_Impl.this).f29927h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((AbstractC7462q.b) it.next()).mo14520c(interfaceC0176g);
                }
            }
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: e */
        public void mo14538e(InterfaceC0176g interfaceC0176g) {
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: f */
        public void mo14539f(InterfaceC0176g interfaceC0176g) throws IOException {
            AbstractC0004b.m4a(interfaceC0176g);
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: g */
        public C7464s.c mo14540g(InterfaceC0176g interfaceC0176g) {
            HashMap map = new HashMap(7);
            map.put("id", new C0007e.a("id", "INTEGER", true, 1, null, 1));
            map.put("time", new C0007e.a("time", "INTEGER", true, 0, null, 1));
            map.put("textTitle", new C0007e.a("textTitle", "TEXT", false, 0, null, 1));
            map.put("textContent", new C0007e.a("textContent", "TEXT", true, 0, null, 1));
            map.put("category", new C0007e.a("category", "TEXT", true, 0, null, 1));
            map.put("orderPin", new C0007e.a("orderPin", "INTEGER", true, 0, null, 1));
            map.put("isUploaded", new C0007e.a("isUploaded", "INTEGER", true, 0, null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new C0007e.c("category_table", "NO ACTION", "NO ACTION", Arrays.asList("category"), Arrays.asList("categoryName")));
            C0007e c0007e = new C0007e("text_table", map, hashSet, new HashSet(0));
            C0007e c0007eM10a = C0007e.m10a(interfaceC0176g, "text_table");
            if (!c0007e.equals(c0007eM10a)) {
                return new C7464s.c(false, "text_table(com.anas_mugally.clipboard.database.entity.Text).\n Expected:\n" + c0007e + "\n Found:\n" + c0007eM10a);
            }
            HashMap map2 = new HashMap(6);
            map2.put("categoryName", new C0007e.a("categoryName", "TEXT", true, 1, null, 1));
            map2.put("order", new C0007e.a("order", "INTEGER", true, 0, null, 1));
            map2.put("isLocked", new C0007e.a("isLocked", "INTEGER", true, 0, null, 1));
            map2.put("pass", new C0007e.a("pass", "TEXT", true, 0, null, 1));
            map2.put("allowBiometric", new C0007e.a("allowBiometric", "INTEGER", true, 0, null, 1));
            map2.put("name", new C0007e.a("name", "TEXT", false, 0, null, 1));
            C0007e c0007e2 = new C0007e("category_table", map2, new HashSet(0), new HashSet(0));
            C0007e c0007eM10a2 = C0007e.m10a(interfaceC0176g, "category_table");
            if (!c0007e2.equals(c0007eM10a2)) {
                return new C7464s.c(false, "category_table(com.anas_mugally.clipboard.database.entity.Category).\n Expected:\n" + c0007e2 + "\n Found:\n" + c0007eM10a2);
            }
            HashMap map3 = new HashMap(3);
            map3.put("id", new C0007e.a("id", "INTEGER", true, 1, null, 1));
            map3.put("time", new C0007e.a("time", "INTEGER", true, 0, null, 1));
            map3.put("text", new C0007e.a("text", "TEXT", true, 0, null, 1));
            C0007e c0007e3 = new C0007e("temporary_text_table", map3, new HashSet(0), new HashSet(0));
            C0007e c0007eM10a3 = C0007e.m10a(interfaceC0176g, "temporary_text_table");
            if (c0007e3.equals(c0007eM10a3)) {
                return new C7464s.c(true, null);
            }
            return new C7464s.c(false, "temporary_text_table(com.anas_mugally.clipboard.database.entity.TemporaryText).\n Expected:\n" + c0007e3 + "\n Found:\n" + c0007eM10a3);
        }
    }

    @Override // com.anas_mugally.clipboard.database.AppDatabase
    /* JADX INFO: renamed from: E */
    public InterfaceC2979a mo15144E() {
        InterfaceC2979a interfaceC2979a;
        if (this.f12601t != null) {
            return this.f12601t;
        }
        synchronized (this) {
            try {
                if (this.f12601t == null) {
                    this.f12601t = new C2980b(this);
                }
                interfaceC2979a = this.f12601t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2979a;
    }

    @Override // com.anas_mugally.clipboard.database.AppDatabase
    /* JADX INFO: renamed from: F */
    public InterfaceC2981c mo15145F() {
        InterfaceC2981c interfaceC2981c;
        if (this.f12602u != null) {
            return this.f12602u;
        }
        synchronized (this) {
            try {
                if (this.f12602u == null) {
                    this.f12602u = new C2982d(this);
                }
                interfaceC2981c = this.f12602u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2981c;
    }

    @Override // com.anas_mugally.clipboard.database.AppDatabase
    /* JADX INFO: renamed from: G */
    public InterfaceC2983e mo15146G() {
        InterfaceC2983e interfaceC2983e;
        if (this.f12600s != null) {
            return this.f12600s;
        }
        synchronized (this) {
            try {
                if (this.f12600s == null) {
                    this.f12600s = new C2984f(this);
                }
                interfaceC2983e = this.f12600s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2983e;
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: g */
    protected C2805c mo14532g() {
        return new C2805c(this, new HashMap(0), new HashMap(0), "text_table", "category_table", "temporary_text_table");
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: h */
    protected InterfaceC0177h mo14533h(C7451f c7451f) {
        return c7451f.f29891c.mo906a(InterfaceC0177h.b.m900a(c7451f.f29889a).m903c(c7451f.f29890b).m902b(new C7464s(c7451f, new C3054a(5), "acf5c44ce1544d4d9382645eedf9ef3e", "2eece6a91bf917e7817f1d9404240d2e")).m901a());
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: j */
    public List mo15154j(Map map) {
        return new ArrayList();
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: o */
    public Set mo15155o() {
        return new HashSet();
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: p */
    protected Map mo15156p() {
        HashMap map = new HashMap();
        map.put(InterfaceC2983e.class, C2984f.m14885z());
        map.put(InterfaceC2979a.class, C2980b.m14847g());
        map.put(InterfaceC2981c.class, C2982d.m14857f());
        return map;
    }
}
