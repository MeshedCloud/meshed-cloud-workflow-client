package cn.meshed.cloud.workflow.engine.command;

import com.alibaba.cola.dto.Command;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * <h1>实例销毁</h1>
 *
 * @author Vincent Vic
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Schema(description = "实例销毁")
public class InstanceDestroyCmd extends Command {

    @Schema(description = "实例编码")
    @NotBlank(message = "实例编码不能为空")
    private String instanceId;
    @Schema(description = "删除缘由")
    @NotBlank(message = "删除缘由不能为空")
    private String reason;
}
