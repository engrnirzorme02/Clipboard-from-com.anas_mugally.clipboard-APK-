package p168W0;

import android.database.Cursor;
import androidx.work.C2896b;
import java.util.ArrayList;
import java.util.List;
import p002A0.AbstractC0003a;
import p002A0.AbstractC0004b;
import p002A0.AbstractC0006d;
import p026D0.InterfaceC0180k;
import p112O0.C1089b;
import p112O0.EnumC1106s;
import p394y0.AbstractC7454i;
import p394y0.AbstractC7462q;
import p394y0.AbstractC7468w;
import p394y0.C7465t;

/* JADX INFO: renamed from: W0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1816r implements InterfaceC1815q {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f5912a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7454i f5913b;

    /* JADX INFO: renamed from: c */
    private final AbstractC7468w f5914c;

    /* JADX INFO: renamed from: d */
    private final AbstractC7468w f5915d;

    /* JADX INFO: renamed from: e */
    private final AbstractC7468w f5916e;

    /* JADX INFO: renamed from: f */
    private final AbstractC7468w f5917f;

    /* JADX INFO: renamed from: g */
    private final AbstractC7468w f5918g;

    /* JADX INFO: renamed from: h */
    private final AbstractC7468w f5919h;

    /* JADX INFO: renamed from: i */
    private final AbstractC7468w f5920i;

    /* JADX INFO: renamed from: j */
    private final AbstractC7468w f5921j;

    /* JADX INFO: renamed from: W0.r$a */
    class a extends AbstractC7454i {
        a(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p394y0.AbstractC7454i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo7515i(InterfaceC0180k interfaceC0180k, C1814p c1814p) throws Throwable {
            String str = c1814p.f5892a;
            if (str == null) {
                interfaceC0180k.mo910m0(1);
            } else {
                interfaceC0180k.mo911t(1, str);
            }
            interfaceC0180k.mo908R(2, AbstractC1820v.m7571j(c1814p.f5893b));
            String str2 = c1814p.f5894c;
            if (str2 == null) {
                interfaceC0180k.mo910m0(3);
            } else {
                interfaceC0180k.mo911t(3, str2);
            }
            String str3 = c1814p.f5895d;
            if (str3 == null) {
                interfaceC0180k.mo910m0(4);
            } else {
                interfaceC0180k.mo911t(4, str3);
            }
            byte[] bArrM14501k = C2896b.m14501k(c1814p.f5896e);
            if (bArrM14501k == null) {
                interfaceC0180k.mo910m0(5);
            } else {
                interfaceC0180k.mo909V(5, bArrM14501k);
            }
            byte[] bArrM14501k2 = C2896b.m14501k(c1814p.f5897f);
            if (bArrM14501k2 == null) {
                interfaceC0180k.mo910m0(6);
            } else {
                interfaceC0180k.mo909V(6, bArrM14501k2);
            }
            interfaceC0180k.mo908R(7, c1814p.f5898g);
            interfaceC0180k.mo908R(8, c1814p.f5899h);
            interfaceC0180k.mo908R(9, c1814p.f5900i);
            interfaceC0180k.mo908R(10, c1814p.f5902k);
            interfaceC0180k.mo908R(11, AbstractC1820v.m7562a(c1814p.f5903l));
            interfaceC0180k.mo908R(12, c1814p.f5904m);
            interfaceC0180k.mo908R(13, c1814p.f5905n);
            interfaceC0180k.mo908R(14, c1814p.f5906o);
            interfaceC0180k.mo908R(15, c1814p.f5907p);
            interfaceC0180k.mo908R(16, c1814p.f5908q ? 1L : 0L);
            interfaceC0180k.mo908R(17, AbstractC1820v.m7570i(c1814p.f5909r));
            C1089b c1089b = c1814p.f5901j;
            if (c1089b == null) {
                interfaceC0180k.mo910m0(18);
                interfaceC0180k.mo910m0(19);
                interfaceC0180k.mo910m0(20);
                interfaceC0180k.mo910m0(21);
                interfaceC0180k.mo910m0(22);
                interfaceC0180k.mo910m0(23);
                interfaceC0180k.mo910m0(24);
                interfaceC0180k.mo910m0(25);
                return;
            }
            interfaceC0180k.mo908R(18, AbstractC1820v.m7569h(c1089b.m4812b()));
            interfaceC0180k.mo908R(19, c1089b.m4817g() ? 1L : 0L);
            interfaceC0180k.mo908R(20, c1089b.m4818h() ? 1L : 0L);
            interfaceC0180k.mo908R(21, c1089b.m4816f() ? 1L : 0L);
            interfaceC0180k.mo908R(22, c1089b.m4819i() ? 1L : 0L);
            interfaceC0180k.mo908R(23, c1089b.m4813c());
            interfaceC0180k.mo908R(24, c1089b.m4814d());
            byte[] bArrM7564c = AbstractC1820v.m7564c(c1089b.m4811a());
            if (bArrM7564c == null) {
                interfaceC0180k.mo910m0(25);
            } else {
                interfaceC0180k.mo909V(25, bArrM7564c);
            }
        }
    }

    /* JADX INFO: renamed from: W0.r$b */
    class b extends AbstractC7468w {
        b(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: W0.r$c */
    class c extends AbstractC7468w {
        c(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: W0.r$d */
    class d extends AbstractC7468w {
        d(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: W0.r$e */
    class e extends AbstractC7468w {
        e(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: W0.r$f */
    class f extends AbstractC7468w {
        f(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: W0.r$g */
    class g extends AbstractC7468w {
        g(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: W0.r$h */
    class h extends AbstractC7468w {
        h(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: W0.r$i */
    class i extends AbstractC7468w {
        i(AbstractC7462q abstractC7462q) {
            super(abstractC7462q);
        }

        @Override // p394y0.AbstractC7468w
        /* JADX INFO: renamed from: e */
        public String mo7514e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C1816r(AbstractC7462q abstractC7462q) {
        this.f5912a = abstractC7462q;
        this.f5913b = new a(abstractC7462q);
        this.f5914c = new b(abstractC7462q);
        this.f5915d = new c(abstractC7462q);
        this.f5916e = new d(abstractC7462q);
        this.f5917f = new e(abstractC7462q);
        this.f5918g = new f(abstractC7462q);
        this.f5919h = new g(abstractC7462q);
        this.f5920i = new h(abstractC7462q);
        this.f5921j = new i(abstractC7462q);
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: a */
    public void mo7537a(String str) {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5914c.m33083b();
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo911t(1, str);
        }
        this.f5912a.m33029e();
        try {
            interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
        } finally {
            this.f5912a.m33031i();
            this.f5914c.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: b */
    public int mo7538b(String str, long j7) {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5919h.m33083b();
        interfaceC0180kM33083b.mo908R(1, j7);
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(2);
        } else {
            interfaceC0180kM33083b.mo911t(2, str);
        }
        this.f5912a.m33029e();
        try {
            int iMo913y = interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
            return iMo913y;
        } finally {
            this.f5912a.m33031i();
            this.f5919h.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: c */
    public List mo7539c(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "state");
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                C1814p.b bVar = new C1814p.b();
                bVar.f5910a = cursorM5b.getString(iM3d);
                bVar.f5911b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d2));
                arrayList.add(bVar);
            }
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            return arrayList;
        } catch (Throwable th) {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            throw th;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: d */
    public List mo7540d(long j7) throws Throwable {
        C7465t c7465t;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c7465tM33069n.mo908R(1, j7);
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "required_network_type");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "requires_charging");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "requires_device_idle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "requires_battery_not_low");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "requires_storage_not_low");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "trigger_content_update_delay");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "trigger_max_content_delay");
            int iM3d8 = AbstractC0003a.m3d(cursorM5b, "content_uri_triggers");
            int iM3d9 = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d10 = AbstractC0003a.m3d(cursorM5b, "state");
            int iM3d11 = AbstractC0003a.m3d(cursorM5b, "worker_class_name");
            int iM3d12 = AbstractC0003a.m3d(cursorM5b, "input_merger_class_name");
            int iM3d13 = AbstractC0003a.m3d(cursorM5b, "input");
            int iM3d14 = AbstractC0003a.m3d(cursorM5b, "output");
            c7465t = c7465tM33069n;
            try {
                int iM3d15 = AbstractC0003a.m3d(cursorM5b, "initial_delay");
                int iM3d16 = AbstractC0003a.m3d(cursorM5b, "interval_duration");
                int iM3d17 = AbstractC0003a.m3d(cursorM5b, "flex_duration");
                int iM3d18 = AbstractC0003a.m3d(cursorM5b, "run_attempt_count");
                int iM3d19 = AbstractC0003a.m3d(cursorM5b, "backoff_policy");
                int iM3d20 = AbstractC0003a.m3d(cursorM5b, "backoff_delay_duration");
                int iM3d21 = AbstractC0003a.m3d(cursorM5b, "period_start_time");
                int iM3d22 = AbstractC0003a.m3d(cursorM5b, "minimum_retention_duration");
                int iM3d23 = AbstractC0003a.m3d(cursorM5b, "schedule_requested_at");
                int iM3d24 = AbstractC0003a.m3d(cursorM5b, "run_in_foreground");
                int iM3d25 = AbstractC0003a.m3d(cursorM5b, "out_of_quota_policy");
                int i7 = iM3d14;
                ArrayList arrayList = new ArrayList(cursorM5b.getCount());
                while (cursorM5b.moveToNext()) {
                    String string = cursorM5b.getString(iM3d9);
                    int i8 = iM3d9;
                    String string2 = cursorM5b.getString(iM3d11);
                    int i9 = iM3d11;
                    C1089b c1089b = new C1089b();
                    int i10 = iM3d;
                    c1089b.m4821k(AbstractC1820v.m7566e(cursorM5b.getInt(iM3d)));
                    c1089b.m4823m(cursorM5b.getInt(iM3d2) != 0);
                    c1089b.m4824n(cursorM5b.getInt(iM3d3) != 0);
                    c1089b.m4822l(cursorM5b.getInt(iM3d4) != 0);
                    c1089b.m4825o(cursorM5b.getInt(iM3d5) != 0);
                    int i11 = iM3d2;
                    int i12 = iM3d3;
                    c1089b.m4826p(cursorM5b.getLong(iM3d6));
                    c1089b.m4827q(cursorM5b.getLong(iM3d7));
                    c1089b.m4820j(AbstractC1820v.m7563b(cursorM5b.getBlob(iM3d8)));
                    C1814p c1814p = new C1814p(string, string2);
                    c1814p.f5893b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d10));
                    c1814p.f5895d = cursorM5b.getString(iM3d12);
                    c1814p.f5896e = C2896b.m14500g(cursorM5b.getBlob(iM3d13));
                    int i13 = i7;
                    c1814p.f5897f = C2896b.m14500g(cursorM5b.getBlob(i13));
                    int i14 = iM3d15;
                    i7 = i13;
                    c1814p.f5898g = cursorM5b.getLong(i14);
                    int i15 = iM3d12;
                    int i16 = iM3d16;
                    c1814p.f5899h = cursorM5b.getLong(i16);
                    int i17 = iM3d4;
                    int i18 = iM3d17;
                    c1814p.f5900i = cursorM5b.getLong(i18);
                    int i19 = iM3d18;
                    c1814p.f5902k = cursorM5b.getInt(i19);
                    int i20 = iM3d19;
                    c1814p.f5903l = AbstractC1820v.m7565d(cursorM5b.getInt(i20));
                    iM3d17 = i18;
                    int i21 = iM3d20;
                    c1814p.f5904m = cursorM5b.getLong(i21);
                    int i22 = iM3d21;
                    c1814p.f5905n = cursorM5b.getLong(i22);
                    iM3d21 = i22;
                    int i23 = iM3d22;
                    c1814p.f5906o = cursorM5b.getLong(i23);
                    int i24 = iM3d23;
                    c1814p.f5907p = cursorM5b.getLong(i24);
                    int i25 = iM3d24;
                    c1814p.f5908q = cursorM5b.getInt(i25) != 0;
                    int i26 = iM3d25;
                    c1814p.f5909r = AbstractC1820v.m7567f(cursorM5b.getInt(i26));
                    c1814p.f5901j = c1089b;
                    arrayList.add(c1814p);
                    iM3d20 = i21;
                    iM3d4 = i17;
                    iM3d19 = i20;
                    iM3d2 = i11;
                    iM3d25 = i26;
                    iM3d12 = i15;
                    iM3d15 = i14;
                    iM3d16 = i16;
                    iM3d18 = i19;
                    iM3d23 = i24;
                    iM3d9 = i8;
                    iM3d11 = i9;
                    iM3d = i10;
                    iM3d24 = i25;
                    iM3d22 = i23;
                    iM3d3 = i12;
                }
                cursorM5b.close();
                c7465t.m33071Q();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5b.close();
                c7465t.m33071Q();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7465t = c7465tM33069n;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: e */
    public List mo7541e(int i7) throws Throwable {
        C7465t c7465t;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c7465tM33069n.mo908R(1, i7);
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "required_network_type");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "requires_charging");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "requires_device_idle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "requires_battery_not_low");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "requires_storage_not_low");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "trigger_content_update_delay");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "trigger_max_content_delay");
            int iM3d8 = AbstractC0003a.m3d(cursorM5b, "content_uri_triggers");
            int iM3d9 = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d10 = AbstractC0003a.m3d(cursorM5b, "state");
            int iM3d11 = AbstractC0003a.m3d(cursorM5b, "worker_class_name");
            int iM3d12 = AbstractC0003a.m3d(cursorM5b, "input_merger_class_name");
            int iM3d13 = AbstractC0003a.m3d(cursorM5b, "input");
            int iM3d14 = AbstractC0003a.m3d(cursorM5b, "output");
            c7465t = c7465tM33069n;
            try {
                int iM3d15 = AbstractC0003a.m3d(cursorM5b, "initial_delay");
                int iM3d16 = AbstractC0003a.m3d(cursorM5b, "interval_duration");
                int iM3d17 = AbstractC0003a.m3d(cursorM5b, "flex_duration");
                int iM3d18 = AbstractC0003a.m3d(cursorM5b, "run_attempt_count");
                int iM3d19 = AbstractC0003a.m3d(cursorM5b, "backoff_policy");
                int iM3d20 = AbstractC0003a.m3d(cursorM5b, "backoff_delay_duration");
                int iM3d21 = AbstractC0003a.m3d(cursorM5b, "period_start_time");
                int iM3d22 = AbstractC0003a.m3d(cursorM5b, "minimum_retention_duration");
                int iM3d23 = AbstractC0003a.m3d(cursorM5b, "schedule_requested_at");
                int iM3d24 = AbstractC0003a.m3d(cursorM5b, "run_in_foreground");
                int iM3d25 = AbstractC0003a.m3d(cursorM5b, "out_of_quota_policy");
                int i8 = iM3d14;
                ArrayList arrayList = new ArrayList(cursorM5b.getCount());
                while (cursorM5b.moveToNext()) {
                    String string = cursorM5b.getString(iM3d9);
                    int i9 = iM3d9;
                    String string2 = cursorM5b.getString(iM3d11);
                    int i10 = iM3d11;
                    C1089b c1089b = new C1089b();
                    int i11 = iM3d;
                    c1089b.m4821k(AbstractC1820v.m7566e(cursorM5b.getInt(iM3d)));
                    c1089b.m4823m(cursorM5b.getInt(iM3d2) != 0);
                    c1089b.m4824n(cursorM5b.getInt(iM3d3) != 0);
                    c1089b.m4822l(cursorM5b.getInt(iM3d4) != 0);
                    c1089b.m4825o(cursorM5b.getInt(iM3d5) != 0);
                    int i12 = iM3d2;
                    int i13 = iM3d3;
                    c1089b.m4826p(cursorM5b.getLong(iM3d6));
                    c1089b.m4827q(cursorM5b.getLong(iM3d7));
                    c1089b.m4820j(AbstractC1820v.m7563b(cursorM5b.getBlob(iM3d8)));
                    C1814p c1814p = new C1814p(string, string2);
                    c1814p.f5893b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d10));
                    c1814p.f5895d = cursorM5b.getString(iM3d12);
                    c1814p.f5896e = C2896b.m14500g(cursorM5b.getBlob(iM3d13));
                    int i14 = i8;
                    c1814p.f5897f = C2896b.m14500g(cursorM5b.getBlob(i14));
                    i8 = i14;
                    int i15 = iM3d15;
                    c1814p.f5898g = cursorM5b.getLong(i15);
                    int i16 = iM3d12;
                    int i17 = iM3d16;
                    c1814p.f5899h = cursorM5b.getLong(i17);
                    int i18 = iM3d4;
                    int i19 = iM3d17;
                    c1814p.f5900i = cursorM5b.getLong(i19);
                    int i20 = iM3d18;
                    c1814p.f5902k = cursorM5b.getInt(i20);
                    int i21 = iM3d19;
                    c1814p.f5903l = AbstractC1820v.m7565d(cursorM5b.getInt(i21));
                    iM3d17 = i19;
                    int i22 = iM3d20;
                    c1814p.f5904m = cursorM5b.getLong(i22);
                    int i23 = iM3d21;
                    c1814p.f5905n = cursorM5b.getLong(i23);
                    iM3d21 = i23;
                    int i24 = iM3d22;
                    c1814p.f5906o = cursorM5b.getLong(i24);
                    int i25 = iM3d23;
                    c1814p.f5907p = cursorM5b.getLong(i25);
                    int i26 = iM3d24;
                    c1814p.f5908q = cursorM5b.getInt(i26) != 0;
                    int i27 = iM3d25;
                    c1814p.f5909r = AbstractC1820v.m7567f(cursorM5b.getInt(i27));
                    c1814p.f5901j = c1089b;
                    arrayList.add(c1814p);
                    iM3d20 = i22;
                    iM3d4 = i18;
                    iM3d19 = i21;
                    iM3d25 = i27;
                    iM3d2 = i12;
                    iM3d12 = i16;
                    iM3d15 = i15;
                    iM3d16 = i17;
                    iM3d18 = i20;
                    iM3d23 = i25;
                    iM3d9 = i9;
                    iM3d11 = i10;
                    iM3d = i11;
                    iM3d24 = i26;
                    iM3d22 = i24;
                    iM3d3 = i13;
                }
                cursorM5b.close();
                c7465t.m33071Q();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5b.close();
                c7465t.m33071Q();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7465t = c7465tM33069n;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: f */
    public List mo7542f() throws Throwable {
        C7465t c7465t;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "required_network_type");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "requires_charging");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "requires_device_idle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "requires_battery_not_low");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "requires_storage_not_low");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "trigger_content_update_delay");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "trigger_max_content_delay");
            int iM3d8 = AbstractC0003a.m3d(cursorM5b, "content_uri_triggers");
            int iM3d9 = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d10 = AbstractC0003a.m3d(cursorM5b, "state");
            int iM3d11 = AbstractC0003a.m3d(cursorM5b, "worker_class_name");
            int iM3d12 = AbstractC0003a.m3d(cursorM5b, "input_merger_class_name");
            int iM3d13 = AbstractC0003a.m3d(cursorM5b, "input");
            int iM3d14 = AbstractC0003a.m3d(cursorM5b, "output");
            c7465t = c7465tM33069n;
            try {
                int iM3d15 = AbstractC0003a.m3d(cursorM5b, "initial_delay");
                int iM3d16 = AbstractC0003a.m3d(cursorM5b, "interval_duration");
                int iM3d17 = AbstractC0003a.m3d(cursorM5b, "flex_duration");
                int iM3d18 = AbstractC0003a.m3d(cursorM5b, "run_attempt_count");
                int iM3d19 = AbstractC0003a.m3d(cursorM5b, "backoff_policy");
                int iM3d20 = AbstractC0003a.m3d(cursorM5b, "backoff_delay_duration");
                int iM3d21 = AbstractC0003a.m3d(cursorM5b, "period_start_time");
                int iM3d22 = AbstractC0003a.m3d(cursorM5b, "minimum_retention_duration");
                int iM3d23 = AbstractC0003a.m3d(cursorM5b, "schedule_requested_at");
                int iM3d24 = AbstractC0003a.m3d(cursorM5b, "run_in_foreground");
                int iM3d25 = AbstractC0003a.m3d(cursorM5b, "out_of_quota_policy");
                int i7 = iM3d14;
                ArrayList arrayList = new ArrayList(cursorM5b.getCount());
                while (cursorM5b.moveToNext()) {
                    String string = cursorM5b.getString(iM3d9);
                    int i8 = iM3d9;
                    String string2 = cursorM5b.getString(iM3d11);
                    int i9 = iM3d11;
                    C1089b c1089b = new C1089b();
                    int i10 = iM3d;
                    c1089b.m4821k(AbstractC1820v.m7566e(cursorM5b.getInt(iM3d)));
                    c1089b.m4823m(cursorM5b.getInt(iM3d2) != 0);
                    c1089b.m4824n(cursorM5b.getInt(iM3d3) != 0);
                    c1089b.m4822l(cursorM5b.getInt(iM3d4) != 0);
                    c1089b.m4825o(cursorM5b.getInt(iM3d5) != 0);
                    int i11 = iM3d2;
                    int i12 = iM3d3;
                    c1089b.m4826p(cursorM5b.getLong(iM3d6));
                    c1089b.m4827q(cursorM5b.getLong(iM3d7));
                    c1089b.m4820j(AbstractC1820v.m7563b(cursorM5b.getBlob(iM3d8)));
                    C1814p c1814p = new C1814p(string, string2);
                    c1814p.f5893b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d10));
                    c1814p.f5895d = cursorM5b.getString(iM3d12);
                    c1814p.f5896e = C2896b.m14500g(cursorM5b.getBlob(iM3d13));
                    int i13 = i7;
                    c1814p.f5897f = C2896b.m14500g(cursorM5b.getBlob(i13));
                    i7 = i13;
                    int i14 = iM3d15;
                    c1814p.f5898g = cursorM5b.getLong(i14);
                    int i15 = iM3d13;
                    int i16 = iM3d16;
                    c1814p.f5899h = cursorM5b.getLong(i16);
                    int i17 = iM3d4;
                    int i18 = iM3d17;
                    c1814p.f5900i = cursorM5b.getLong(i18);
                    int i19 = iM3d18;
                    c1814p.f5902k = cursorM5b.getInt(i19);
                    int i20 = iM3d19;
                    c1814p.f5903l = AbstractC1820v.m7565d(cursorM5b.getInt(i20));
                    iM3d17 = i18;
                    int i21 = iM3d20;
                    c1814p.f5904m = cursorM5b.getLong(i21);
                    int i22 = iM3d21;
                    c1814p.f5905n = cursorM5b.getLong(i22);
                    iM3d21 = i22;
                    int i23 = iM3d22;
                    c1814p.f5906o = cursorM5b.getLong(i23);
                    int i24 = iM3d23;
                    c1814p.f5907p = cursorM5b.getLong(i24);
                    int i25 = iM3d24;
                    c1814p.f5908q = cursorM5b.getInt(i25) != 0;
                    int i26 = iM3d25;
                    c1814p.f5909r = AbstractC1820v.m7567f(cursorM5b.getInt(i26));
                    c1814p.f5901j = c1089b;
                    arrayList.add(c1814p);
                    iM3d20 = i21;
                    iM3d4 = i17;
                    iM3d19 = i20;
                    iM3d25 = i26;
                    iM3d2 = i11;
                    iM3d13 = i15;
                    iM3d15 = i14;
                    iM3d16 = i16;
                    iM3d18 = i19;
                    iM3d23 = i24;
                    iM3d9 = i8;
                    iM3d11 = i9;
                    iM3d = i10;
                    iM3d24 = i25;
                    iM3d22 = i23;
                    iM3d3 = i12;
                }
                cursorM5b.close();
                c7465t.m33071Q();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5b.close();
                c7465t.m33071Q();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7465t = c7465tM33069n;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: g */
    public void mo7543g(String str, C2896b c2896b) throws Throwable {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5915d.m33083b();
        byte[] bArrM14501k = C2896b.m14501k(c2896b);
        if (bArrM14501k == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo909V(1, bArrM14501k);
        }
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(2);
        } else {
            interfaceC0180kM33083b.mo911t(2, str);
        }
        this.f5912a.m33029e();
        try {
            interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
        } finally {
            this.f5912a.m33031i();
            this.f5915d.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: h */
    public void mo7544h(C1814p c1814p) {
        this.f5912a.m33028d();
        this.f5912a.m33029e();
        try {
            this.f5913b.m33016k(c1814p);
            this.f5912a.m33042z();
        } finally {
            this.f5912a.m33031i();
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: i */
    public List mo7545i() throws Throwable {
        C7465t c7465t;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "required_network_type");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "requires_charging");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "requires_device_idle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "requires_battery_not_low");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "requires_storage_not_low");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "trigger_content_update_delay");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "trigger_max_content_delay");
            int iM3d8 = AbstractC0003a.m3d(cursorM5b, "content_uri_triggers");
            int iM3d9 = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d10 = AbstractC0003a.m3d(cursorM5b, "state");
            int iM3d11 = AbstractC0003a.m3d(cursorM5b, "worker_class_name");
            int iM3d12 = AbstractC0003a.m3d(cursorM5b, "input_merger_class_name");
            int iM3d13 = AbstractC0003a.m3d(cursorM5b, "input");
            int iM3d14 = AbstractC0003a.m3d(cursorM5b, "output");
            c7465t = c7465tM33069n;
            try {
                int iM3d15 = AbstractC0003a.m3d(cursorM5b, "initial_delay");
                int iM3d16 = AbstractC0003a.m3d(cursorM5b, "interval_duration");
                int iM3d17 = AbstractC0003a.m3d(cursorM5b, "flex_duration");
                int iM3d18 = AbstractC0003a.m3d(cursorM5b, "run_attempt_count");
                int iM3d19 = AbstractC0003a.m3d(cursorM5b, "backoff_policy");
                int iM3d20 = AbstractC0003a.m3d(cursorM5b, "backoff_delay_duration");
                int iM3d21 = AbstractC0003a.m3d(cursorM5b, "period_start_time");
                int iM3d22 = AbstractC0003a.m3d(cursorM5b, "minimum_retention_duration");
                int iM3d23 = AbstractC0003a.m3d(cursorM5b, "schedule_requested_at");
                int iM3d24 = AbstractC0003a.m3d(cursorM5b, "run_in_foreground");
                int iM3d25 = AbstractC0003a.m3d(cursorM5b, "out_of_quota_policy");
                int i7 = iM3d14;
                ArrayList arrayList = new ArrayList(cursorM5b.getCount());
                while (cursorM5b.moveToNext()) {
                    String string = cursorM5b.getString(iM3d9);
                    int i8 = iM3d9;
                    String string2 = cursorM5b.getString(iM3d11);
                    int i9 = iM3d11;
                    C1089b c1089b = new C1089b();
                    int i10 = iM3d;
                    c1089b.m4821k(AbstractC1820v.m7566e(cursorM5b.getInt(iM3d)));
                    c1089b.m4823m(cursorM5b.getInt(iM3d2) != 0);
                    c1089b.m4824n(cursorM5b.getInt(iM3d3) != 0);
                    c1089b.m4822l(cursorM5b.getInt(iM3d4) != 0);
                    c1089b.m4825o(cursorM5b.getInt(iM3d5) != 0);
                    int i11 = iM3d2;
                    int i12 = iM3d3;
                    c1089b.m4826p(cursorM5b.getLong(iM3d6));
                    c1089b.m4827q(cursorM5b.getLong(iM3d7));
                    c1089b.m4820j(AbstractC1820v.m7563b(cursorM5b.getBlob(iM3d8)));
                    C1814p c1814p = new C1814p(string, string2);
                    c1814p.f5893b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d10));
                    c1814p.f5895d = cursorM5b.getString(iM3d12);
                    c1814p.f5896e = C2896b.m14500g(cursorM5b.getBlob(iM3d13));
                    int i13 = i7;
                    c1814p.f5897f = C2896b.m14500g(cursorM5b.getBlob(i13));
                    i7 = i13;
                    int i14 = iM3d15;
                    c1814p.f5898g = cursorM5b.getLong(i14);
                    int i15 = iM3d13;
                    int i16 = iM3d16;
                    c1814p.f5899h = cursorM5b.getLong(i16);
                    int i17 = iM3d4;
                    int i18 = iM3d17;
                    c1814p.f5900i = cursorM5b.getLong(i18);
                    int i19 = iM3d18;
                    c1814p.f5902k = cursorM5b.getInt(i19);
                    int i20 = iM3d19;
                    c1814p.f5903l = AbstractC1820v.m7565d(cursorM5b.getInt(i20));
                    iM3d17 = i18;
                    int i21 = iM3d20;
                    c1814p.f5904m = cursorM5b.getLong(i21);
                    int i22 = iM3d21;
                    c1814p.f5905n = cursorM5b.getLong(i22);
                    iM3d21 = i22;
                    int i23 = iM3d22;
                    c1814p.f5906o = cursorM5b.getLong(i23);
                    int i24 = iM3d23;
                    c1814p.f5907p = cursorM5b.getLong(i24);
                    int i25 = iM3d24;
                    c1814p.f5908q = cursorM5b.getInt(i25) != 0;
                    int i26 = iM3d25;
                    c1814p.f5909r = AbstractC1820v.m7567f(cursorM5b.getInt(i26));
                    c1814p.f5901j = c1089b;
                    arrayList.add(c1814p);
                    iM3d20 = i21;
                    iM3d4 = i17;
                    iM3d19 = i20;
                    iM3d25 = i26;
                    iM3d2 = i11;
                    iM3d13 = i15;
                    iM3d15 = i14;
                    iM3d16 = i16;
                    iM3d18 = i19;
                    iM3d23 = i24;
                    iM3d9 = i8;
                    iM3d11 = i9;
                    iM3d = i10;
                    iM3d24 = i25;
                    iM3d22 = i23;
                    iM3d3 = i12;
                }
                cursorM5b.close();
                c7465t.m33071Q();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5b.close();
                c7465t.m33071Q();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7465t = c7465tM33069n;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: j */
    public int mo7546j(EnumC1106s enumC1106s, String... strArr) {
        this.f5912a.m33028d();
        StringBuilder sbM9b = AbstractC0006d.m9b();
        sbM9b.append("UPDATE workspec SET state=");
        sbM9b.append("?");
        sbM9b.append(" WHERE id IN (");
        AbstractC0006d.m8a(sbM9b, strArr.length);
        sbM9b.append(")");
        InterfaceC0180k interfaceC0180kM33030f = this.f5912a.m33030f(sbM9b.toString());
        interfaceC0180kM33030f.mo908R(1, AbstractC1820v.m7571j(enumC1106s));
        int i7 = 2;
        for (String str : strArr) {
            if (str == null) {
                interfaceC0180kM33030f.mo910m0(i7);
            } else {
                interfaceC0180kM33030f.mo911t(i7, str);
            }
            i7++;
        }
        this.f5912a.m33029e();
        try {
            int iMo913y = interfaceC0180kM33030f.mo913y();
            this.f5912a.m33042z();
            return iMo913y;
        } finally {
            this.f5912a.m33031i();
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: k */
    public boolean mo7547k() {
        boolean z7 = false;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            if (cursorM5b.moveToFirst() && cursorM5b.getInt(0) != 0) {
                z7 = true;
            }
            return z7;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: l */
    public List mo7548l(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(cursorM5b.getString(0));
            }
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            return arrayList;
        } catch (Throwable th) {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            throw th;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: m */
    public EnumC1106s mo7549m(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            return cursorM5b.moveToFirst() ? AbstractC1820v.m7568g(cursorM5b.getInt(0)) : null;
        } finally {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: n */
    public C1814p mo7550n(String str) throws Throwable {
        C7465t c7465t;
        C1814p c1814p;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "required_network_type");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "requires_charging");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "requires_device_idle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "requires_battery_not_low");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "requires_storage_not_low");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "trigger_content_update_delay");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "trigger_max_content_delay");
            int iM3d8 = AbstractC0003a.m3d(cursorM5b, "content_uri_triggers");
            int iM3d9 = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d10 = AbstractC0003a.m3d(cursorM5b, "state");
            int iM3d11 = AbstractC0003a.m3d(cursorM5b, "worker_class_name");
            int iM3d12 = AbstractC0003a.m3d(cursorM5b, "input_merger_class_name");
            int iM3d13 = AbstractC0003a.m3d(cursorM5b, "input");
            int iM3d14 = AbstractC0003a.m3d(cursorM5b, "output");
            c7465t = c7465tM33069n;
            try {
                int iM3d15 = AbstractC0003a.m3d(cursorM5b, "initial_delay");
                int iM3d16 = AbstractC0003a.m3d(cursorM5b, "interval_duration");
                int iM3d17 = AbstractC0003a.m3d(cursorM5b, "flex_duration");
                int iM3d18 = AbstractC0003a.m3d(cursorM5b, "run_attempt_count");
                int iM3d19 = AbstractC0003a.m3d(cursorM5b, "backoff_policy");
                int iM3d20 = AbstractC0003a.m3d(cursorM5b, "backoff_delay_duration");
                int iM3d21 = AbstractC0003a.m3d(cursorM5b, "period_start_time");
                int iM3d22 = AbstractC0003a.m3d(cursorM5b, "minimum_retention_duration");
                int iM3d23 = AbstractC0003a.m3d(cursorM5b, "schedule_requested_at");
                int iM3d24 = AbstractC0003a.m3d(cursorM5b, "run_in_foreground");
                int iM3d25 = AbstractC0003a.m3d(cursorM5b, "out_of_quota_policy");
                if (cursorM5b.moveToFirst()) {
                    String string = cursorM5b.getString(iM3d9);
                    String string2 = cursorM5b.getString(iM3d11);
                    C1089b c1089b = new C1089b();
                    c1089b.m4821k(AbstractC1820v.m7566e(cursorM5b.getInt(iM3d)));
                    c1089b.m4823m(cursorM5b.getInt(iM3d2) != 0);
                    c1089b.m4824n(cursorM5b.getInt(iM3d3) != 0);
                    c1089b.m4822l(cursorM5b.getInt(iM3d4) != 0);
                    c1089b.m4825o(cursorM5b.getInt(iM3d5) != 0);
                    c1089b.m4826p(cursorM5b.getLong(iM3d6));
                    c1089b.m4827q(cursorM5b.getLong(iM3d7));
                    c1089b.m4820j(AbstractC1820v.m7563b(cursorM5b.getBlob(iM3d8)));
                    C1814p c1814p2 = new C1814p(string, string2);
                    c1814p2.f5893b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d10));
                    c1814p2.f5895d = cursorM5b.getString(iM3d12);
                    c1814p2.f5896e = C2896b.m14500g(cursorM5b.getBlob(iM3d13));
                    c1814p2.f5897f = C2896b.m14500g(cursorM5b.getBlob(iM3d14));
                    c1814p2.f5898g = cursorM5b.getLong(iM3d15);
                    c1814p2.f5899h = cursorM5b.getLong(iM3d16);
                    c1814p2.f5900i = cursorM5b.getLong(iM3d17);
                    c1814p2.f5902k = cursorM5b.getInt(iM3d18);
                    c1814p2.f5903l = AbstractC1820v.m7565d(cursorM5b.getInt(iM3d19));
                    c1814p2.f5904m = cursorM5b.getLong(iM3d20);
                    c1814p2.f5905n = cursorM5b.getLong(iM3d21);
                    c1814p2.f5906o = cursorM5b.getLong(iM3d22);
                    c1814p2.f5907p = cursorM5b.getLong(iM3d23);
                    c1814p2.f5908q = cursorM5b.getInt(iM3d24) != 0;
                    c1814p2.f5909r = AbstractC1820v.m7567f(cursorM5b.getInt(iM3d25));
                    c1814p2.f5901j = c1089b;
                    c1814p = c1814p2;
                } else {
                    c1814p = null;
                }
                cursorM5b.close();
                c7465t.m33071Q();
                return c1814p;
            } catch (Throwable th) {
                th = th;
                cursorM5b.close();
                c7465t.m33071Q();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7465t = c7465tM33069n;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: o */
    public int mo7551o(String str) {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5918g.m33083b();
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo911t(1, str);
        }
        this.f5912a.m33029e();
        try {
            int iMo913y = interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
            return iMo913y;
        } finally {
            this.f5912a.m33031i();
            this.f5918g.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: p */
    public List mo7552p(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(cursorM5b.getString(0));
            }
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            return arrayList;
        } catch (Throwable th) {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            throw th;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: q */
    public List mo7553q(String str) {
        C7465t c7465tM33069n = C7465t.m33069n("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c7465tM33069n.mo910m0(1);
        } else {
            c7465tM33069n.mo911t(1, str);
        }
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM5b.getCount());
            while (cursorM5b.moveToNext()) {
                arrayList.add(C2896b.m14500g(cursorM5b.getBlob(0)));
            }
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            return arrayList;
        } catch (Throwable th) {
            cursorM5b.close();
            c7465tM33069n.m33071Q();
            throw th;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: r */
    public int mo7554r(String str) {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5917f.m33083b();
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(1);
        } else {
            interfaceC0180kM33083b.mo911t(1, str);
        }
        this.f5912a.m33029e();
        try {
            int iMo913y = interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
            return iMo913y;
        } finally {
            this.f5912a.m33031i();
            this.f5917f.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: s */
    public void mo7555s(String str, long j7) {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5916e.m33083b();
        interfaceC0180kM33083b.mo908R(1, j7);
        if (str == null) {
            interfaceC0180kM33083b.mo910m0(2);
        } else {
            interfaceC0180kM33083b.mo911t(2, str);
        }
        this.f5912a.m33029e();
        try {
            interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
        } finally {
            this.f5912a.m33031i();
            this.f5916e.m33085h(interfaceC0180kM33083b);
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: t */
    public List mo7556t(int i7) throws Throwable {
        C7465t c7465t;
        C7465t c7465tM33069n = C7465t.m33069n("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c7465tM33069n.mo908R(1, i7);
        this.f5912a.m33028d();
        Cursor cursorM5b = AbstractC0004b.m5b(this.f5912a, c7465tM33069n, false, null);
        try {
            int iM3d = AbstractC0003a.m3d(cursorM5b, "required_network_type");
            int iM3d2 = AbstractC0003a.m3d(cursorM5b, "requires_charging");
            int iM3d3 = AbstractC0003a.m3d(cursorM5b, "requires_device_idle");
            int iM3d4 = AbstractC0003a.m3d(cursorM5b, "requires_battery_not_low");
            int iM3d5 = AbstractC0003a.m3d(cursorM5b, "requires_storage_not_low");
            int iM3d6 = AbstractC0003a.m3d(cursorM5b, "trigger_content_update_delay");
            int iM3d7 = AbstractC0003a.m3d(cursorM5b, "trigger_max_content_delay");
            int iM3d8 = AbstractC0003a.m3d(cursorM5b, "content_uri_triggers");
            int iM3d9 = AbstractC0003a.m3d(cursorM5b, "id");
            int iM3d10 = AbstractC0003a.m3d(cursorM5b, "state");
            int iM3d11 = AbstractC0003a.m3d(cursorM5b, "worker_class_name");
            int iM3d12 = AbstractC0003a.m3d(cursorM5b, "input_merger_class_name");
            int iM3d13 = AbstractC0003a.m3d(cursorM5b, "input");
            int iM3d14 = AbstractC0003a.m3d(cursorM5b, "output");
            c7465t = c7465tM33069n;
            try {
                int iM3d15 = AbstractC0003a.m3d(cursorM5b, "initial_delay");
                int iM3d16 = AbstractC0003a.m3d(cursorM5b, "interval_duration");
                int iM3d17 = AbstractC0003a.m3d(cursorM5b, "flex_duration");
                int iM3d18 = AbstractC0003a.m3d(cursorM5b, "run_attempt_count");
                int iM3d19 = AbstractC0003a.m3d(cursorM5b, "backoff_policy");
                int iM3d20 = AbstractC0003a.m3d(cursorM5b, "backoff_delay_duration");
                int iM3d21 = AbstractC0003a.m3d(cursorM5b, "period_start_time");
                int iM3d22 = AbstractC0003a.m3d(cursorM5b, "minimum_retention_duration");
                int iM3d23 = AbstractC0003a.m3d(cursorM5b, "schedule_requested_at");
                int iM3d24 = AbstractC0003a.m3d(cursorM5b, "run_in_foreground");
                int iM3d25 = AbstractC0003a.m3d(cursorM5b, "out_of_quota_policy");
                int i8 = iM3d14;
                ArrayList arrayList = new ArrayList(cursorM5b.getCount());
                while (cursorM5b.moveToNext()) {
                    String string = cursorM5b.getString(iM3d9);
                    int i9 = iM3d9;
                    String string2 = cursorM5b.getString(iM3d11);
                    int i10 = iM3d11;
                    C1089b c1089b = new C1089b();
                    int i11 = iM3d;
                    c1089b.m4821k(AbstractC1820v.m7566e(cursorM5b.getInt(iM3d)));
                    c1089b.m4823m(cursorM5b.getInt(iM3d2) != 0);
                    c1089b.m4824n(cursorM5b.getInt(iM3d3) != 0);
                    c1089b.m4822l(cursorM5b.getInt(iM3d4) != 0);
                    c1089b.m4825o(cursorM5b.getInt(iM3d5) != 0);
                    int i12 = iM3d2;
                    int i13 = iM3d3;
                    c1089b.m4826p(cursorM5b.getLong(iM3d6));
                    c1089b.m4827q(cursorM5b.getLong(iM3d7));
                    c1089b.m4820j(AbstractC1820v.m7563b(cursorM5b.getBlob(iM3d8)));
                    C1814p c1814p = new C1814p(string, string2);
                    c1814p.f5893b = AbstractC1820v.m7568g(cursorM5b.getInt(iM3d10));
                    c1814p.f5895d = cursorM5b.getString(iM3d12);
                    c1814p.f5896e = C2896b.m14500g(cursorM5b.getBlob(iM3d13));
                    int i14 = i8;
                    c1814p.f5897f = C2896b.m14500g(cursorM5b.getBlob(i14));
                    i8 = i14;
                    int i15 = iM3d15;
                    c1814p.f5898g = cursorM5b.getLong(i15);
                    int i16 = iM3d12;
                    int i17 = iM3d16;
                    c1814p.f5899h = cursorM5b.getLong(i17);
                    int i18 = iM3d4;
                    int i19 = iM3d17;
                    c1814p.f5900i = cursorM5b.getLong(i19);
                    int i20 = iM3d18;
                    c1814p.f5902k = cursorM5b.getInt(i20);
                    int i21 = iM3d19;
                    c1814p.f5903l = AbstractC1820v.m7565d(cursorM5b.getInt(i21));
                    iM3d17 = i19;
                    int i22 = iM3d20;
                    c1814p.f5904m = cursorM5b.getLong(i22);
                    int i23 = iM3d21;
                    c1814p.f5905n = cursorM5b.getLong(i23);
                    iM3d21 = i23;
                    int i24 = iM3d22;
                    c1814p.f5906o = cursorM5b.getLong(i24);
                    int i25 = iM3d23;
                    c1814p.f5907p = cursorM5b.getLong(i25);
                    int i26 = iM3d24;
                    c1814p.f5908q = cursorM5b.getInt(i26) != 0;
                    int i27 = iM3d25;
                    c1814p.f5909r = AbstractC1820v.m7567f(cursorM5b.getInt(i27));
                    c1814p.f5901j = c1089b;
                    arrayList.add(c1814p);
                    iM3d20 = i22;
                    iM3d4 = i18;
                    iM3d19 = i21;
                    iM3d25 = i27;
                    iM3d2 = i12;
                    iM3d12 = i16;
                    iM3d15 = i15;
                    iM3d16 = i17;
                    iM3d18 = i20;
                    iM3d23 = i25;
                    iM3d9 = i9;
                    iM3d11 = i10;
                    iM3d = i11;
                    iM3d24 = i26;
                    iM3d22 = i24;
                    iM3d3 = i13;
                }
                cursorM5b.close();
                c7465t.m33071Q();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM5b.close();
                c7465t.m33071Q();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c7465t = c7465tM33069n;
        }
    }

    @Override // p168W0.InterfaceC1815q
    /* JADX INFO: renamed from: u */
    public int mo7557u() {
        this.f5912a.m33028d();
        InterfaceC0180k interfaceC0180kM33083b = this.f5920i.m33083b();
        this.f5912a.m33029e();
        try {
            int iMo913y = interfaceC0180kM33083b.mo913y();
            this.f5912a.m33042z();
            return iMo913y;
        } finally {
            this.f5912a.m33031i();
            this.f5920i.m33085h(interfaceC0180kM33083b);
        }
    }
}
