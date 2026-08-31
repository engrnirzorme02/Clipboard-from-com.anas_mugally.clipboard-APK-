package androidx.work.impl;

import androidx.room.C2805c;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p002A0.AbstractC0004b;
import p002A0.C0007e;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0177h;
import p168W0.C1801c;
import p168W0.C1804f;
import p168W0.C1807i;
import p168W0.C1810l;
import p168W0.C1813o;
import p168W0.C1816r;
import p168W0.C1819u;
import p168W0.InterfaceC1800b;
import p168W0.InterfaceC1803e;
import p168W0.InterfaceC1806h;
import p168W0.InterfaceC1809k;
import p168W0.InterfaceC1812n;
import p168W0.InterfaceC1815q;
import p168W0.InterfaceC1818t;
import p394y0.AbstractC7462q;
import p394y0.C7451f;
import p394y0.C7464s;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: q */
    private volatile InterfaceC1815q f11889q;

    /* JADX INFO: renamed from: r */
    private volatile InterfaceC1800b f11890r;

    /* JADX INFO: renamed from: s */
    private volatile InterfaceC1818t f11891s;

    /* JADX INFO: renamed from: t */
    private volatile InterfaceC1806h f11892t;

    /* JADX INFO: renamed from: u */
    private volatile InterfaceC1809k f11893u;

    /* JADX INFO: renamed from: v */
    private volatile InterfaceC1812n f11894v;

    /* JADX INFO: renamed from: w */
    private volatile InterfaceC1803e f11895w;

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C2899a extends C7464s.b {
        C2899a(int i7) {
            super(i7);
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: a */
        public void mo14534a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC0176g.mo888s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: b */
        public void mo14535b(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `Dependency`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `WorkName`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS `Preference`");
            if (((AbstractC7462q) WorkDatabase_Impl.this).f29927h != null) {
                int size = ((AbstractC7462q) WorkDatabase_Impl.this).f29927h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((AbstractC7462q.b) ((AbstractC7462q) WorkDatabase_Impl.this).f29927h.get(i7)).m33051b(interfaceC0176g);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: c */
        public void mo14536c(InterfaceC0176g interfaceC0176g) {
            if (((AbstractC7462q) WorkDatabase_Impl.this).f29927h != null) {
                int size = ((AbstractC7462q) WorkDatabase_Impl.this).f29927h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((AbstractC7462q.b) ((AbstractC7462q) WorkDatabase_Impl.this).f29927h.get(i7)).m33050a(interfaceC0176g);
                }
            }
        }

        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: d */
        public void mo14537d(InterfaceC0176g interfaceC0176g) {
            ((AbstractC7462q) WorkDatabase_Impl.this).f29920a = interfaceC0176g;
            interfaceC0176g.mo888s("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m33038u(interfaceC0176g);
            if (((AbstractC7462q) WorkDatabase_Impl.this).f29927h != null) {
                int size = ((AbstractC7462q) WorkDatabase_Impl.this).f29927h.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((AbstractC7462q.b) ((AbstractC7462q) WorkDatabase_Impl.this).f29927h.get(i7)).mo14520c(interfaceC0176g);
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

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p394y0.C7464s.b
        /* JADX INFO: renamed from: g */
        public C7464s.c mo14540g(InterfaceC0176g interfaceC0176g) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new C0007e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new C0007e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C0007e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C0007e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0007e.e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C0007e.e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C0007e c0007e = new C0007e("Dependency", map, hashSet, hashSet2);
            C0007e c0007eM10a = C0007e.m10a(interfaceC0176g, "Dependency");
            if (!c0007e.equals(c0007eM10a)) {
                return new C7464s.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c0007e + "\n Found:\n" + c0007eM10a);
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new C0007e.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new C0007e.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new C0007e.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new C0007e.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new C0007e.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new C0007e.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new C0007e.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new C0007e.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new C0007e.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new C0007e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new C0007e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new C0007e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new C0007e.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new C0007e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new C0007e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new C0007e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new C0007e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new C0007e.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new C0007e.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new C0007e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new C0007e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new C0007e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new C0007e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new C0007e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new C0007e.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C0007e.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C0007e.e("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C0007e c0007e2 = new C0007e("WorkSpec", map2, hashSet3, hashSet4);
            C0007e c0007eM10a2 = C0007e.m10a(interfaceC0176g, "WorkSpec");
            if (!c0007e2.equals(c0007eM10a2)) {
                return new C7464s.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c0007e2 + "\n Found:\n" + c0007eM10a2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new C0007e.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new C0007e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C0007e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C0007e.e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C0007e c0007e3 = new C0007e("WorkTag", map3, hashSet5, hashSet6);
            C0007e c0007eM10a3 = C0007e.m10a(interfaceC0176g, "WorkTag");
            if (!c0007e3.equals(c0007eM10a3)) {
                return new C7464s.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c0007e3 + "\n Found:\n" + c0007eM10a3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new C0007e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new C0007e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C0007e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C0007e c0007e4 = new C0007e("SystemIdInfo", map4, hashSet7, new HashSet(0));
            C0007e c0007eM10a4 = C0007e.m10a(interfaceC0176g, "SystemIdInfo");
            if (!c0007e4.equals(c0007eM10a4)) {
                return new C7464s.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c0007e4 + "\n Found:\n" + c0007eM10a4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new C0007e.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new C0007e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C0007e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C0007e.e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C0007e c0007e5 = new C0007e("WorkName", map5, hashSet8, hashSet9);
            C0007e c0007eM10a5 = C0007e.m10a(interfaceC0176g, "WorkName");
            if (!c0007e5.equals(c0007eM10a5)) {
                return new C7464s.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c0007e5 + "\n Found:\n" + c0007eM10a5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new C0007e.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new C0007e.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C0007e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C0007e c0007e6 = new C0007e("WorkProgress", map6, hashSet10, new HashSet(0));
            C0007e c0007eM10a6 = C0007e.m10a(interfaceC0176g, "WorkProgress");
            if (!c0007e6.equals(c0007eM10a6)) {
                return new C7464s.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c0007e6 + "\n Found:\n" + c0007eM10a6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new C0007e.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new C0007e.a("long_value", "INTEGER", false, 0, null, 1));
            C0007e c0007e7 = new C0007e("Preference", map7, new HashSet(0), new HashSet(0));
            C0007e c0007eM10a7 = C0007e.m10a(interfaceC0176g, "Preference");
            if (c0007e7.equals(c0007eM10a7)) {
                return new C7464s.c(true, null);
            }
            return new C7464s.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c0007e7 + "\n Found:\n" + c0007eM10a7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: C */
    public InterfaceC1800b mo14513C() {
        InterfaceC1800b interfaceC1800b;
        if (this.f11890r != null) {
            return this.f11890r;
        }
        synchronized (this) {
            try {
                if (this.f11890r == null) {
                    this.f11890r = new C1801c(this);
                }
                interfaceC1800b = this.f11890r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1800b;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: G */
    public InterfaceC1803e mo14514G() {
        InterfaceC1803e interfaceC1803e;
        if (this.f11895w != null) {
            return this.f11895w;
        }
        synchronized (this) {
            try {
                if (this.f11895w == null) {
                    this.f11895w = new C1804f(this);
                }
                interfaceC1803e = this.f11895w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1803e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: H */
    public InterfaceC1806h mo14515H() {
        InterfaceC1806h interfaceC1806h;
        if (this.f11892t != null) {
            return this.f11892t;
        }
        synchronized (this) {
            try {
                if (this.f11892t == null) {
                    this.f11892t = new C1807i(this);
                }
                interfaceC1806h = this.f11892t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1806h;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: I */
    public InterfaceC1809k mo14516I() {
        InterfaceC1809k interfaceC1809k;
        if (this.f11893u != null) {
            return this.f11893u;
        }
        synchronized (this) {
            try {
                if (this.f11893u == null) {
                    this.f11893u = new C1810l(this);
                }
                interfaceC1809k = this.f11893u;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1809k;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: J */
    public InterfaceC1812n mo14517J() {
        InterfaceC1812n interfaceC1812n;
        if (this.f11894v != null) {
            return this.f11894v;
        }
        synchronized (this) {
            try {
                if (this.f11894v == null) {
                    this.f11894v = new C1813o(this);
                }
                interfaceC1812n = this.f11894v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1812n;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: K */
    public InterfaceC1815q mo14518K() {
        InterfaceC1815q interfaceC1815q;
        if (this.f11889q != null) {
            return this.f11889q;
        }
        synchronized (this) {
            try {
                if (this.f11889q == null) {
                    this.f11889q = new C1816r(this);
                }
                interfaceC1815q = this.f11889q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1815q;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: L */
    public InterfaceC1818t mo14519L() {
        InterfaceC1818t interfaceC1818t;
        if (this.f11891s != null) {
            return this.f11891s;
        }
        synchronized (this) {
            try {
                if (this.f11891s == null) {
                    this.f11891s = new C1819u(this);
                }
                interfaceC1818t = this.f11891s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1818t;
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: g */
    protected C2805c mo14532g() {
        return new C2805c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p394y0.AbstractC7462q
    /* JADX INFO: renamed from: h */
    protected InterfaceC0177h mo14533h(C7451f c7451f) {
        return c7451f.f29891c.mo906a(InterfaceC0177h.b.m900a(c7451f.f29889a).m903c(c7451f.f29890b).m902b(new C7464s(c7451f, new C2899a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).m901a());
    }
}
