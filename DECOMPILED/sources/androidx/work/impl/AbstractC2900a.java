package androidx.work.impl;

import android.content.Context;
import p026D0.InterfaceC0176g;
import p175X0.C1928f;
import p175X0.C1930h;
import p402z0.AbstractC7558a;

/* JADX INFO: renamed from: androidx.work.impl.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2900a {

    /* JADX INFO: renamed from: a */
    public static AbstractC7558a f11897a = new a(1, 2);

    /* JADX INFO: renamed from: b */
    public static AbstractC7558a f11898b = new b(3, 4);

    /* JADX INFO: renamed from: c */
    public static AbstractC7558a f11899c = new c(4, 5);

    /* JADX INFO: renamed from: d */
    public static AbstractC7558a f11900d = new d(6, 7);

    /* JADX INFO: renamed from: e */
    public static AbstractC7558a f11901e = new e(7, 8);

    /* JADX INFO: renamed from: f */
    public static AbstractC7558a f11902f = new f(8, 9);

    /* JADX INFO: renamed from: g */
    public static AbstractC7558a f11903g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a */
    class a extends AbstractC7558a {
        a(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC0176g.mo888s("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC0176g.mo888s("DROP TABLE IF EXISTS alarmInfo");
            interfaceC0176g.mo888s("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$b */
    class b extends AbstractC7558a {
        b(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$c */
    class c extends AbstractC7558a {
        c(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC0176g.mo888s("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$d */
    class d extends AbstractC7558a {
        d(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$e */
    class e extends AbstractC7558a {
        e(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$f */
    class f extends AbstractC7558a {
        f(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$g */
    class g extends AbstractC7558a {
        g(int i7, int i8) {
            super(i7, i8);
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$h */
    public static class h extends AbstractC7558a {

        /* JADX INFO: renamed from: c */
        final Context f11904c;

        public h(Context context, int i7, int i8) {
            super(i7, i8);
            this.f11904c = context;
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            if (this.f30214b >= 10) {
                interfaceC0176g.mo879S("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f11904c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.a$i */
    public static class i extends AbstractC7558a {

        /* JADX INFO: renamed from: c */
        final Context f11905c;

        public i(Context context) {
            super(9, 10);
            this.f11905c = context;
        }

        @Override // p402z0.AbstractC7558a
        /* JADX INFO: renamed from: a */
        public void mo14541a(InterfaceC0176g interfaceC0176g) {
            interfaceC0176g.mo888s("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C1930h.m7978b(this.f11905c, interfaceC0176g);
            C1928f.m7972a(this.f11905c, interfaceC0176g);
        }
    }
}
